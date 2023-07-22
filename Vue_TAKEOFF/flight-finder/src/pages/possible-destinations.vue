<template>
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
            possibleDestinations : []
        }
    },
    created() {
        UtilitiesService.getPossibleDestinations(this.$route.params.keyword)
        .then(response => {
            this.possibleDestinations = response.data;
        })
    }
}
</script>

<style scoped>
</style>