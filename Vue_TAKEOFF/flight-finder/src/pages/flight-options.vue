<template>
<div>
{{flightOffers}}    
</div>  
</template>

<script>
import FlightService from "../services/FlightService.js";
export default {
    data(){
        return{
            flightOffers: [],
        }
    },
    created:{
        getFlights(){
            FlightService.getFlights(
                this.store.state.flightPreferencesDto.originLocationCode,
                this.store.state.flightPreferencesDto.destinationLocationCode,
                this.store.state.flightPreferencesDto.departureDate,
                this.store.state.flightPreferencesDto.returnDate,
                this.store.state.flightPreferencesDto.adults
            ).then(
                response=>{
                    this.flightOffers=response.data
                }
            )
        }
    }
}
</script>

<style>

</style>