<template>
<div>
<flight-offer-card v-for="flightOffer in flightOffers" :key="flightOffer.id" :flightOffer="flightOffer"/> 
</div>  
</template>

<script>
import FlightService from "../services/FlightService.js";
import FlightOfferCard from "../components/FlightOfferCard.vue";
export default {
    components: {FlightOfferCard},
    data(){
        return{
            flightOffers: [],
        }
    },
    created(){
        
            FlightService.getFlights(
                this.$store.state.flightPreferencesDto
            ).then(
                response=>{
                    this.flightOffers=response.data
                    this.$store.commit('SET_FLIGHT_OFFERS_ARRAY', response.data);
                }
            )
        }
    }

</script>

<style>

</style>