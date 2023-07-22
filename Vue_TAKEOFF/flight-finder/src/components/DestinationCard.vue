<template>
<div>
    <h1> {{ destination.name }}</h1>
    <h2>{{ destination.address.stateCode }}</h2>
    <p>{{ destination.iataCode }}</p>
    <button @click="seeHotelsInDestination">SEE HOTELS</button>
</div>
</template>

<script>
export default {
    name: 'DestinationCard',
    props: ['destination'],
    data() {},
    methods: {
        seeHotelsInDestination(){
        this.$router.push({ name: 'HotelView', params: {iataCode: this.destination.iataCode}});
        }
    }
}


</script>


<style>

</style>