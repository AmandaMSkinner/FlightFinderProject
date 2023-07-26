<template>
<div>
    <span v-if="clicked">You Selected a Destination!</span>
    <h1> {{ destination.name }}</h1>
    <h2>{{ destination.address.stateCode }}</h2>
    <p>{{ destination.iataCode }}</p>
    <button @click="setDestinationCode()">SELECT DESTINATION</button>
</div>
</template>

<script>
export default {
    name: 'DestinationCard',
    props: ['destination'],
    data() {
        return{
            destinationLocationCode : "",
            clicked : false
        }
    },
    methods: {
        setDestinationCode(){
        //this only works for obj w/iataCodes
        this.$store.state.flightPreferencesDto.destinationLocationCode=this.destination.iataCode;
        this.clicked=true;

        }
    }
}


</script>


<style scoped>

span{
    width: 10px;
    height: auto;
    background-color: green;
}

</style>