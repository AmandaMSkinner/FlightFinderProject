<template>
  <main>
    <div id="spinner-style" v-if="loading">
      <img id="plane" src="spinner.gif"/>
    </div>
    <h2 v-if="!loading" id="origin-select">Select Origin Location</h2>
    <h3 v-if="!loading" id="current-origin">
      Your current origin is:
      {{ this.$store.state.flightPreferencesDto.originLocationCode }}
    </h3>
    <div v-if="!loading">
      <flight-origin-card
        v-for="(destination, index) in possibleOrigins"
        :key="index"
        v-bind:destination="destination"
      />
    </div>
    <h2 v-if="!loading" id="destination-select">Select Destination Location</h2>
    <h3 v-if="!loading" id="current-destination">
      Your desired destination is:
      {{ this.$store.state.flightPreferencesDto.destinationLocationCode }}
    </h3>
    <div v-if="!loading">
      <flight-destination-card
        v-for="(destination, index) in possibleDestinations"
        :key="index"
        v-bind:destination="destination"
      />
    </div>
    <button v-if="!loading" @click="viewResults()">SEE FLIGHTS</button>
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
        UtilitiesService.getPossibleDestinations(
          this.$store.state.flightPreferencesDto.destinationInput
        ).then((response) => {
          this.possibleDestinations = response.data;
          this.loading = false;
        });
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
  background-color: var(--fourth-color);
  background-image: url(clouds2_taylor-van-riper-yQorCngxzwI-unsplash.jpg);
  background-size: cover;
  background-position: center center;
  min-height: 100vh;
  padding-bottom: 1em;
}

#spinner-style {
  width: 100vw;
  display: flex;
  justify-content: center;
}

#origin-select {
  background-color: var(--primary-color);
  padding-left: 0.5em;
  padding: 1em;
  border-top: 5px solid rgba(90, 160, 240, 0.432);
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
  width: 100%;
  background-color: rgba(170, 40, 17, 0.884);
  padding: .5em;
  margin-top: 1em;
  /* margin-bottom: 2em; */
  font-size: 1.5rem;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-left: auto;
  margin-right: auto;
  font-weight: 600;
}

button:hover {
  color: var(--eighth-color);
}

#plane {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: 20em;
  margin-bottom: 20em;
}
</style>