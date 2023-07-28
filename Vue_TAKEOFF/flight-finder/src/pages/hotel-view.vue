<script>
import HotelService from "../services/HotelService.js";
import UtilitiesService from "../services/UtilitiesService.js";
import HotelCards from "../components/HotelCards.vue";

export default {
  name: "HotelView",
  components: {
    HotelService,
    UtilitiesService,
    HotelCards
  },
  data() {
    return {
      hotelsAndOffers: [],
      loading: false
    };
  },
  created() {
    this.loading = true;
    HotelService.getHotelsAndOffers(
      this.$route.params.iataCode,
      this.$store.state.hotelPreferencesDto.adults,
      this.$store.state.hotelPreferencesDto.checkIn,
      this.$store.state.hotelPreferencesDto.checkOut
    ).then((response) => {
      this.hotelsAndOffers = response.data;
      this.loading = false;
    });

    

    
  },

};
</script>

<template>
  <main>
    <div class="text-box">
      <h4>Browse through Hotel options</h4>
      <h5>
        Prices displayed include taxes and may change based on availability. You
        can review any additional fees before checkout. Prices are not final
        until you complete your purchase.
      </h5>
      <div style="width: 100vw; display: flex; justify-content: center">
      <img src="spinner.gif" v-if="loading" />
    </div>
    </div>






    <hotel-cards v-for="(hotelAndOffer,index) in hotelsAndOffers" :key="index" :hotelAndOffer="hotelAndOffer"/>
   
   
  </main>
</template>

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

.text-box {
  width: 100%;
  background-color: var(--eighth-color);
}

.text-box > h4 {
  color: black;
  font-size: 1.25rem;
}

.text-box > h5 {
  color: black;
}

#search {
  background-color: var(--third-color);
  width: 100%;
  padding: .25em;
}
</style>
