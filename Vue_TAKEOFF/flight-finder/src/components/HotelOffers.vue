<template>

<!-- Have product offer cards that v-for through the hotelOffers array and display offers at a particular hotel -->

<HotelOfferCards :hotelOffers="hotelOffers"/>

</template>



<script>
import hotelService from '../services/HotelService.js';
import HotelOfferCards from './HotelOfferCards.vue';
export default {
    data(){
        return {
            hotelOffers : []
        }
    },
    name : 'hotelOffers',
    components : {HotelOfferCards},
    created(){
    hotelService.getHotelOffersByHotelId(
        this.$route.params.hotelId,
        this.$store.state.hotelPreferencesDto.adults,
        this.$store.state.hotelPreferencesDto.checkIn,
        this.$store.state.hotelPreferencesDto.checkOut)
    .then(response => {
        this.hotelOffers = response.data[0].offers;
    })
    }
}
</script>


<style scoped>
</style>