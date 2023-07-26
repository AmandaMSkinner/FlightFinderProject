<template>

    <div style="width: 100vw; display: flex; justify-content: center;">
        <img src="spinner.gif" v-if = "loading"/>
    </div>

    <div v-if="hotelOfferDetails">
        
        <h2> {{(hotelOfferDetails.price.total).toLocaleString('en-US', { style: 'currency', currency: 'USD'})  }}</h2>
        <h2> {{ hotelOfferDetails.checkInDate}}</h2>
        <h2> {{ hotelOfferDetails.checkOutDate }}</h2>
        
        <h2> {{ hotelOfferDetails.guests.adults }}</h2>
        <h2> {{ hotelOfferDetails.room.typeEstimated.category }}</h2>
        <h2> {{ hotelOfferDetails.room.typeEstimated.beds }}</h2>
        <h2> {{ hotelOfferDetails.room.typeEstimated.bedType}}</h2>
        <h2> {{ hotel.name }}</h2>
        <h2> {{ hotelOfferDetails.room.description.text }}</h2>

        <button @click="bookHotel"> BOOK HOTEL </button>
      


    </div>
</template>
    
    <script>
    import { pushScopeId } from 'vue';
import HotelService  from '../services/HotelService';

    export default {
        
        components: {},
        data(){
            
            return {
                hotelOfferDetails : null,
                hotel: null,
                loading : false
            }
        },
        created() {
            this.loading = true;
            HotelService.getHotelOfferDetailsByOfferId(this.$route.params.offerId)
            .then(response => {
                this.hotelOfferDetails = response.data.offers[0];
                this.hotel = response.data.hotel;
                this.loading = false;
            })
            
        },
        methods : {
            bookHotel(){
                this.$router.push({name:'Confirmation'})
            }
        }
    }
    </script>
    
    <style scoped>
    </style>