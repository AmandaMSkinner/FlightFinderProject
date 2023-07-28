<template>
<div id="origin-card" v-if="destination.iataCode">
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
:root {
    --primary-color: #0038FF;
    --secondary-color: #85C4FF;
    --third-color: #ffffff;
    --fourth-color: #000000;
    --fifth-color: #e0e0e0;
    --sixth-color: #db0f0f;
    --seventh-color: #8a2020;
    --eighth-color: #ffc107;
}

* {
    box-sizing: border-box;
}


#origin-card {
    margin-top: 1em;
    display: flex;
    gap: 30px;
    width: 99%;
    height: 100px;
    background-color: var(--fifth-color);
    border: 1px solid var(--eighth-color);
    border-radius: 10px;
    justify-content: space-between;
    align-items: center;
    flex-wrap: no-wrap;
    color: black;

}

h1 {
    font-size: 1.5rem;
    padding-left: .5em;
    display: flex;
    flex-grow: 1;
}

button {
    background-color: var(--primary-color);
    width: 150px;
    height: 70px;
    padding: .75em;
    border-radius: 10px;
    margin-right: 1em;
    color: white;
    font-weight: 600;
    
}

button:hover {
    color: var(--eighth-color);
    border: 1px solid var(--third-color);
}
</style>