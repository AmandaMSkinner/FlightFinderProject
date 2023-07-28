<template>
  <main>
    <div id="plane-container">
      <img id="plane" src="spinner.gif" v-if="loading" />
    </div>

    <div id="hotelOfferDetails" v-if="hotelOfferDetails">
      <img
        id="hotel-image"
        src="hotel4_francesca-saraco-_dS27XGgRyQ-unsplash.jpg"
      />
      <h2 id="hotel-name">{{ hotel.name }}</h2>

      <h2>
        <span>Price:</span>
        ${{
          hotelOfferDetails.price.total.toLocaleString("en-US", {
            style: "currency",
            currency: "USD",
          })
        }}
      </h2>
      <h2><span>Check-in:</span> {{ hotelOfferDetails.checkInDate }}</h2>
      <h2><span>Check-out:</span> {{ hotelOfferDetails.checkOutDate }}</h2>

      <h2><span>Adults:</span> {{ hotelOfferDetails.guests.adults }}</h2>
      <h2 v-if="hotelOfferDetails.room.typeEstimated != null">
        {{ hotelOfferDetails.room.typeEstimated.category }}
      </h2>
      <h2 v-if="hotelOfferDetails.room.typeEstimated != null">
        {{ hotelOfferDetails.room.typeEstimated.beds }}
      </h2>
      <h2 v-if="hotelOfferDetails.room.typeEstimated != null">
        {{ hotelOfferDetails.room.typeEstimated.bedType }}
      </h2>
      <!-- <h2>{{ hotelOfferDetails.room.description.text }}</h2> -->

      <button @click="bookHotel">BOOK HOTEL</button>
    </div>
  </main>
</template>
    
    <script>
import { pushScopeId } from "vue";
import HotelService from "../services/HotelService";

export default {
  components: {},
  data() {
    return {
      hotelOfferDetails: null,
      hotel: null,
      loading: false,
    };
  },
  created() {
    this.loading = true;
    HotelService.getHotelOfferDetailsByOfferId(this.$route.params.offerId).then(
      (response) => {
        this.hotelOfferDetails = response.data.offers[0];
        this.hotel = response.data.hotel;
        this.loading = false;
      }
    );
  },
  methods: {
    bookHotel() {
      this.$router.push({ name: "Confirmation" });
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
    overflow: auto;
}

#plane-container {
  background-color: var(--eighth-color);
  height: 100vh;
}

#plane {
  padding-top: 20em;
  width: 100vw;
  display: flex;
  justify-content: center;
  background-color: var(--eighth-color);
}

span {
  color: var(--primary-color);
}

#hotel-image {
    width: 550px;
    border: 2px solid var(--primary-color);
    height: auto;
}

#hotelOfferDetails {
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
  flex-direction: column;
  color: black;
  width: 100%;
  margin-top: -50em;
  
}

button {
  background-color: var(--primary-color);
  padding: 1em;
  width: 500px;
  color: white;
  font-weight: 600;
}

button:hover {
    color: var(--eighth-color);
    border: 3px solid var(--secondary-color);
}

#hotel-name {
  color: var(--fourth-color);
}
</style>