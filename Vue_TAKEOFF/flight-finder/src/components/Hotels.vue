<template>

    <section>
        <article v-for="hotel in hotels" v-bind:key="hotel.hotelId">
            <h1 @click="seeOffersAtHotel(hotel)">
                {{ hotel.name }}
            </h1>
        </article>
    </section>

</template>

<!-- {
    "iataCode": "JAX",
    "address": {
        "countryCode": "US"
    },
    "chainCode": "AL",
    "dupeId": 700157043,
    "name": "ALOFT JACKSONVILLE TAPESTRY PRK",
    "geoCode": {
        "latitude": 30.25984,
        "longitude": -81.55382
    },
    "hotelId": "ALJAX549"
}, -->

<script>
import hotelService from '../services/HotelService.js';
export default {
    data(){
        return {
            hotels : []
        }
    },
    name : 'hotels',
    created(){
        hotelService.getHotelsByCity(city,[stars],[amenities])
        .then(response => {
            hotels = response.data;
        })
    },
    methods: {
        seeOffersAtHotel(hotel){
            this.$router.push({name: 'hotelOffers', params: {hotelId:hotel.hotelId}})
        }
    }
}
</script>


<style scoped>
</style>