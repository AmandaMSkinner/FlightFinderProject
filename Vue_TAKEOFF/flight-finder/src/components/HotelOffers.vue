<template>
  <!-- Have product offer cards that v-for through the hotelOffers array and display offers at a particular hotel -->
  <main>
    <div style="width: 100vw; display: flex; justify-content: center">
      <img src="spinner.gif" v-if="loading" />
    </div>
    <HotelOfferCards v-if="hotelOffers" :hotelOffers="hotelOffers" />
    <p v-if="errorMessage">Sorry, there was an issue retrieving your results</p>
  </main>
</template>



<script>
import hotelService from "../services/HotelService.js";
import HotelOfferCards from "./HotelOfferCards.vue";
export default {
  data() {
    return {
      loading: false,
      errorMessage: null,
      hotelOffers: [],
    };
  },
  name: "hotelOffers",
  components: { HotelOfferCards },
  created() {
    this.loading = true;
    hotelService
      .getHotelOffersByHotelId(
        this.$route.params.hotelId,
        this.$store.state.hotelPreferencesDto.adults,
        this.$store.state.hotelPreferencesDto.checkIn,
        this.$store.state.hotelPreferencesDto.checkOut
      )
      .then((response) => {
        this.hotelOffers = response.data[0].offers;
        this.loading = false;
      })
      .catch((err) => {
        this.errorMessage = err;
        this.loading = false;
      });
  },
};
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
main {
    background-color: var(--eight-color);
    height: 100vh;
}
</style>