<template>
  <main>
    <div id="spinner-style">
      <img id="plane" src="spinner.gif" v-if="loading" />
      <h1 v-if="!loading" class="header-h1">Select Locations</h1>
    </div>
    <h2 id="origin-select">Select Origin Location</h2>
    <h3 id="current-origin">
      Your current origin is:
      {{ this.$store.state.flightPreferencesDto.originLocationCode }}
    </h3>
    <div>
      <flight-origin-card
        v-for="(destination, index) in possibleOrigins"
        :key="index"
        v-bind:destination="destination"
      />
    </div>
    <h2 id="destination-select">Select Destination Location</h2>
    <h3 id="current-destination">
      Your desired destination is:
      {{ this.$store.state.flightPreferencesDto.destinationLocationCode }}
    </h3>
    <div>
      <flight-destination-card
        v-for="(destination, index) in possibleDestinations"
        :key="index"
        v-bind:destination="destination"
      />
    </div>
    <button @click="viewResults()">SEE FLIGHTS</button>
  </main>
</template>

<script>
import UtilitiesService from "../services/UtilitiesService";
import FlightDestinationCard from "../components/FlightDestinationCard.vue";
import FlightOriginCard from "../components/FlightOriginCard.vue";

export default {
  components: { FlightDestinationCard, FlightOriginCard },
  data() {
    return {
      possibleOrigins: [],
      possibleDestinations: [],
      loading: false,
    };
  },
  created() {
    this.loading = true;
    UtilitiesService.getPossibleDestinations(
      this.$store.state.flightPreferencesDto.originInput
    ).then((response) => {
      this.possibleOrigins = response.data;
      //this.loading = false;
    });
    UtilitiesService.getPossibleDestinations(
      this.$store.state.flightPreferencesDto.destinationInput
    ).then((response) => {
      this.possibleDestinations = response.data;
      this.loading = false;
    });
  },
  methods: {
    viewResults() {
      this.$router.push({ name: "FlightOptions" });
    },
  },
};
</script>

<style scoped>
:root {
  --primary-color: #0038ff;
  --secondary-color: #85c4ff;
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

main {
  background-color: var(--eighth-color);
}

.header-h1 {
  display: flex;
  align-items: center;
  color: var(--primary-color);
}

#spinner-style {
  width: 100vw;
  display: flex;
  justify-content: center;
  height: 10vh;
}

#origin-select {
  background-color: var(--primary-color);
  border-top: 2px solid var(--fifth-color);
  padding-left: 0.5em;
  padding: 1em;
}

#current-origin {
  background-color: var(--secondary-color);
  padding: 1em;
  color: var(--fourth-color);
}

#destination-select {
  background-color: var(--primary-color);
  padding: 1em;
  margin-top: 1em;
}

#current-destination {
  background-color: var(--secondary-color);
  padding-left: 1em;
  padding: 1em;
  color: var(--fourth-color);
}

button {
  width: 500px;
  background-color: var(--primary-color);
  padding: .5em;
  margin-top: 1em;
  /* margin-bottom: 2em; */
  border: 2px solid var(--eighth-color);
  font-size: 2rem;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-left: auto;
  margin-right: auto;
}

button:hover {
  border: 5px solid var(--secondary-color);
  color: var(--eighth-color);
}

#plane {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 20vh;
  margin-top: 20em;
  margin-bottom: 20em;
}
</style>