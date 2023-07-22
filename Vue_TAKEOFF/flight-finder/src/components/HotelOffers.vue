<template>

</template>



<script>
import hotelService from '../services/HotelService.js';
export default {
    data(){
        return {
            hotelOffers : []
        }
    },
    name : 'hotelOffers',
    created(){
    hotelService.getHotelOffersByHotelId(
        this.$route.params,
        this.$store.state.hotelPreferencesDto.adults,
        this.$store.state.hotelPreferencesDto.checkIn,
        this.$store.state.hotelPreferencesDto.checkOut)
    .then(response => {
        this.hotelOffers = response.data;
    })
    }
}
</script>


<style scoped>
</style>