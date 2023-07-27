<template>
<div>

        <h2> {{ flightOffer.travelerPricings[0].price.total}}</h2>
        <h2> {{ flightOffer.travelerPricings[0].fareDetailsBySegment[0].cabin }}</h2>
        <!-- <h2>{{ flightOffer.itineraries[0].segments[0].numberOfStops }}</h2> -->
        <h2> {{ loseTheT(flightOffer.itineraries[0].segments[0].arrival.at) }}</h2>
        <h2> {{ loseTheT(flightOffer.itineraries[0].segments[0].departure.at)  }}</h2>
        <h2> {{ businessName }} </h2>
        <button @click="selectOffer">SELECT OFFER</button>


</div>
</template>


<script>
import UtilitiesService from '../services/UtilitiesService.js'
export default {
   data(){
    return {
        businessName : ''
    }
   },
   props: {
    flightOffer : {}
   },
   methods: {
    loseTheT(string){
        return string.split("T")[0];
    },
    selectOffer(){
        this.$router.push({name: 'FlightOfferDetails', params: {id:this.flightOffer.id}})
    },
    getBusinessNameFromCarrierCode(carrierCode){
        UtilitiesService.getBusinessNamesByCarrierCode(carrierCode)
        .then(response => {
            this.carrierCode = response.data;
        })
    }

   },
   created() {
        let carrierCode = this.flightOffer.itineraries[0].segments[0].carrierCode;
        if (this.$store.state.flightCarrierCodeCache[carrierCode] !== undefined){
            this.businessName = this.$store.state.flightCarrierCodeCache[carrierCode];
        } else {
            let businessName = this.getBusinessNameFromCarrierCode(carrierCode);
            this.businessName = businessName;
            this.$store.commit("ADD_FLIGHT_CARRIER_CODE_CACHE", carrierCode, businessName);
            }
        }
   }

</script>


<style>

</style>