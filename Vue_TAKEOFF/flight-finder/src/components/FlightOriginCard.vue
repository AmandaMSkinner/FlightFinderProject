<template>
<div>
    <h1> {{ destination.name }}</h1>
    <h2>{{ destination.address.stateCode }}</h2>
    <p>{{ destination.iataCode }}</p>
    <button @click="setOriginCode()">SELECT ORIGIN</button>
</div>
</template>

<script>
export default {
    name: 'FlightOriginCard',
    props: ['destination'],
    data() {
        return{
            originLocationCode : "",
        }
    },
    methods: {
        setOriginCode(){
        //this only works for obj w/iataCodes
        this.$store.state.flightPreferencesDto.originLocationCode=this.destination.iataCode;

        }
    }
}


</script>


<style scoped>


</style>