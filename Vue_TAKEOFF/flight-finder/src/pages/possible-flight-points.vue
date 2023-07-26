<template>
<div style="width: 100vw; display: flex; justify-content: center;">
    <img src="spinner.gif" v-if = "loading"/>
</div>
<h2>Select the Origin:</h2>
<h3>Your current origin is: {{this.$store.state.flightPreferencesDto.originLocationCode}}</h3>
<div>
    <flight-origin-card v-for="(destination, index) in possibleOrigins" :key="index" v-bind:destination="destination" />
</div>
<hr>
<h2>Select the Destination:</h2>
<h3>Your current destination is: {{this.$store.state.flightPreferencesDto.destinationLocationCode}}</h3>
<div>
    <flight-destination-card v-for="(destination, index) in possibleDestinations" :key="index" v-bind:destination="destination" />
</div>
<hr>
<button @click="viewResults()">SEE FLIGHTS</button>
 
</template>

<script>
import UtilitiesService from '../services/UtilitiesService';
import FlightDestinationCard from '../components/FlightDestinationCard.vue';
import FlightOriginCard from '../components/FlightOriginCard.vue';

export default {
    components: {FlightDestinationCard, FlightOriginCard},
    data(){
        return{
            possibleOrigins:[],
            possibleDestinations:[],
            loading: false
        }
    },
    created(){
        this.loading = true;
        UtilitiesService.getPossibleDestinations(this.$store.state.flightPreferencesDto.originInput)        .then(response => {
            this.possibleOrigins = response.data;
            //this.loading = false;
        })
        UtilitiesService.getPossibleDestinations(this.$store.state.flightPreferencesDto.destinationInput)        .then(response => {
            this.possibleDestinations = response.data;
            this.loading = false;
        })
    },
    methods:{
        viewResults(){
            this.$router.push({name: "FlightOptions"})
        }
    }
}
</script>

<style>

</style>