<template>
<div style="width: 100vw; display: flex; justify-content: center;">
    <img src="spinner.gif" v-if = "loading"/>
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
        
        return {
            possibleDestinations : [],
            loading : false
        }
    },
    created() {
        this.loading = true;
        UtilitiesService.getPossibleDestinations(this.$route.params.keyword)
        .then(response => {
            this.possibleDestinations = response.data;
            this.loading = false;
        })
    }
}
</script>

<style scoped>
</style>