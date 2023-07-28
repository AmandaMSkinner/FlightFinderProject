<template>
  <div id="main">
    <div>
      <img id="plane" src="spinner.gif" v-if="loading" />
    </div>
    <flight-offer-card
      v-for="flightOffer in flightOffers"
      :key="flightOffer.id"
      :flightOffer="flightOffer"
    />
  </div>
</template>

<script>
import FlightService from "../services/FlightService.js";
import FlightOfferCard from "../components/FlightOfferCard.vue";
export default {
  components: { FlightOfferCard },
  data() {
    return {
      flightOffers: [],
      loading: false,
    };
  },
  created() {
    this.loading = true;
    FlightService.getFlights(this.$store.state.flightPreferencesDto).then(
      (response) => {
        this.flightOffers = response.data;
        this.$store.commit("SET_FLIGHT_OFFERS_ARRAY", response.data);
        this.loading = false;
      }
    );
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
#main {
  background-color: var(--eighth-color);
  height: 100vh;
  width: 99%;
  overflow: auto;
}

#plane {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-top: 20em;
}
</style>