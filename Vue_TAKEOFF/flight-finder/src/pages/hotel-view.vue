<script>
import HotelService from "../services/HotelService.js";
import HotelCards from "../components/HotelCards.vue";
import FiltrationOption from "../components/FiltrationOptions.vue";
import UtilitiesService from "../services/UtilitiesService.js";

export default {
  name: "HotelView",
  components: {
    FiltrationOption,
    HotelCards,
    HotelService,
    UtilitiesService
  },
  data() {
    return {
      hotels: [],
    };
  },
  created() {
    UtilitiesService.getIataCode(city).then((response) => {
      const iataCode = response.data.iataCode;
      HotelService.getHotelsByCity(
        iataCode
      ).then((response) => {
        this.hotels = response.data;
      });
    })
  },
  /*
  async created2() {
    const iataResponse = await UtilitiesService.getIataCode(city);
    const iataCode = iataResponse.data.iataCode;
    const hotelsResponse = await HotelService.getHotelsByCity(iataCode);
    this.hotels = hotelsResponse.data;
  },
  */
  methods: {
    seeOffersAtHotel(hotel) {
      this.$router.push({
        name: "hotelOffers",
        params: { hotelId: hotel.hotelId },
      });
    },
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

      <input
        type="text"
        placeholder="Search"
        v-model="searchTerm"
        v-on:keydown="searchHotels"
      />
    </div>

    <filtration-options />
    <hotel-cards/>
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
</style>
