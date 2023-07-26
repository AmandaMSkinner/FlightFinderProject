<template>
<div style="width: 100vw; display: flex; justify-content: center;">
    <img src="spinner.gif" v-if = "loading"/>
</div>
<div>
    <destination-card v-for="(destination, index) in possibleOrigins" :key="index" v-bind:destination="destination" />
</div>
<div>
    <destination-card v-for="(destination, index) in possibleDestinations" :key="index" v-bind:destination="destination" />
</div>
 

</template>

<script>
import UtilitiesService from '../services/UtilitiesService';
import DestinationCard from '../components/DestinationCard.vue';

export default {
    components: {DestinationCard},
    data(){
        return{
            possibleOrigins:[],
            possibleDestinations:[],
            loading: false
        }
    },
    created(){
        this.loading = true;
        UtilitiesService.getPossibleDestinations(this.$store.state.flightPreferencesDto.originLocationCode)        .then(response => {
            this.possibleOrigins = response.data;
            //this.loading = false;
        })
        UtilitiesService.getPossibleDestinations(this.$store.state.flightPreferencesDto.destinationLocationCode)        .then(response => {
            this.possibleDestinations = response.data;
            this.loading = false;
        })
    }
}
</script>

<style>

</style>