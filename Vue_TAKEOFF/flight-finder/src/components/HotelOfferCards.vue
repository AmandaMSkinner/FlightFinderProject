<template>

    <div v-for="(hotelOffer, index) in hotelOffers" v-bind:key="index">
        <h2> {{ (hotelOffer.price.total * 0.012).toLocaleString('en-US', { style: 'currency', currency: 'USD'})  }}</h2>
        <h2> {{ hotelOffer.checkInDate }}</h2>
        <h2> {{ hotelOffer.checkOutDate }}</h2>
        <h2> {{  hotelOffer.room.typeEstimated.category.replace('_', ' ') }}</h2>
        <h2> Beds: {{  hotelOffer.room.typeEstimated.beds }}</h2>
        <h2> {{  hotelOffer.room.typeEstimated.bedType }}</h2>
 

        
        <button @click="seeOfferDetails">SEE HOTELS</button>

    </div>
    </template>
    
    <script>
    export default {
        name: 'HotelOfferCard',
        props: ['hotelOffers'],
        data() {},
        methods: {
            // seeHotelsInDestination(){
            // this.$router.push({ name: 'HotelView', params: {iataCode: this.destination.iataCode}});
            // }
        }
    }
    
    
    </script>
    
    
    <style>
    
    </style>