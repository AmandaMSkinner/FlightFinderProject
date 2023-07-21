<template>
    <section>
        
        <article v-for="(offer, index) in hotelOffers" v-bind:key="index">
            <h1>{{ offer.name }}</h1>
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
            hotelOffers : []
        }
    },
    name : 'hotelOffers',
    created(){
        hotelService.goToJaxAndSwim().then(response => {
            console.log(response.data);
           this.hotelOffers = response.data;
        })
    }
}
</script>


<style scoped>
</style>