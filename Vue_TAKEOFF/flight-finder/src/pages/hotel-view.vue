<script>
import HotelService from "../services/HotelService.js";
import UtilitiesService from "../services/UtilitiesService.js";
import HotelCards from "../components/HotelCards.vue";

export default {
  name: "HotelView",
  components: {
    HotelService,
    UtilitiesService,
    HotelCards,
  },
  data() {
    return {
      hotelsAndOffers: [],
      loading: false,
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
      <h4 id="heading-h4">Browse through Hotel options</h4>
      <h5 id="p-h5">
        Prices displayed include taxes and may change based on availability. You
        can review any additional fees before checkout. Prices are not final
        until you complete your purchase.
      </h5>
      <h5 id="p-h5">
        While we strive to offer real-time room availability, the actual
        availability may vary due to factors such as recent bookings,
        cancellations, or modifications. Therefore, we cannot guarantee that a
        specific room type or package will be available for your preferred
        dates.
      </h5>
      <div style="width: 100vw; display: flex; justify-content: center">
        <img id="plane" src="spinner.gif" v-if="loading" />
      </div>
    </div>

    <hotel-cards
      v-for="(hotelAndOffer, index) in hotelsAndOffers"
      :key="index"
      :hotelAndOffer="hotelAndOffer"
    />

    <div id="disclaimer">
      <h1>Hotel Disclaimer:</h1>
      <p>
        While we make every effort to maintain accurate and reliable
        information, we disclaim all liability for any inaccuracies, errors, or
        omissions in the hotel information displayed on our website. We also
        cannot be held responsible for any losses, damages, or inconveniences
        caused by reliance on this information.
      </p>
    </div>
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

main {
  background-color: var(--eighth-color);
  overflow: auto;
  height: 100%;
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
  padding: 0.25em;
}

#plane {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: 10em;
  margin-bottom: 15em;
}

#heading-h4 {
  padding-top: 1.5em;
  padding-left: 1.5em;
}

#p-h5 {
  width: 90%;
  padding-top: 1.5em;
  padding-left: 2em;
}

#disclaimer {
  color: black;
  background-color: var(--eighth-color);
  padding: 1em;
  
}

#disclaimer > h1 {
  font-size: 1rem;
}

#disclaimer > p {
  font-size: 1rem;
}
</style>
