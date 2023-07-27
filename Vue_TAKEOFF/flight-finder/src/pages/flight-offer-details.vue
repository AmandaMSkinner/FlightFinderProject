<template>
        <h2> {{ flightOffer.travelerPricings[0].price.total}}</h2>
        <h2> {{ flightOffer.travelerPricings[0].fareDetailsBySegment[0].cabin }}</h2>
        <!-- <h2>{{ flightOffer.itineraries[0].segments[0].numberOfStops }}</h2> -->
        <h2> {{ loseTheT(flightOffer.itineraries[0].segments[0].arrival.at) }}</h2>
        <h2> {{ loseTheT(flightOffer.itineraries[0].segments[0].departure.at)  }}</h2>
       <h2>{{ fixDuration(flightOffer.itineraries[0].segments[0].duration) }}</h2>

</template>

<script>
export default {
    data(){
        return {
            flightOffer : this.$store.state.flightOffers.filter(offer => {
                return offer.id === this.$route.params.id;
            })[0]
        }
    },
    methods: {
        loseTheT(string){
            return string.substring(2)
        },

        fixDuration(string){
            return string.split("PT")[1];
        }

  
    }
}
</script>

<style>

</style>