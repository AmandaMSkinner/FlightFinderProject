<template>
  <main>
    <div id="flight-offer-card">
      <h2><span>Airline: </span>{{ businessName }}</h2>
      <h2>
        <span>Cabin:</span>
        {{ flightOffer.travelerPricings[0].fareDetailsBySegment[0].cabin }}
      </h2>
       <h2>
        <span>Departure:</span>
        {{ loseTheT(flightOffer.itineraries[0].segments[0].departure.at) }}
      </h2>
      <h2>
        <span>Arrival:</span>
        {{ loseTheT(flightOffer.itineraries[0].segments[0].arrival.at) }}
      </h2>
      <h2>
        <span>Total:</span> {{ flightOffer.travelerPricings[0].price.total }}
      </h2>
     
      <button @click="selectOffer">SELECT OFFER</button>
    </div>
  </main>
</template>


<script>
import UtilitiesService from "../services/UtilitiesService.js";
export default {
  data() {
    return {
      businessName: "",
    };
  },
  props: {
    flightOffer: {},
  },
  methods: {
    loseTheT(string) {
      return string.split("T")[0];
    },
    selectOffer() {
      this.$router.push({
        name: "FlightOfferDetails",
        params: { id: this.flightOffer.id },
      });
    },
    getBusinessNameFromCarrierCode(carrierCode) {
      UtilitiesService.getBusinessNamesByCarrierCode(carrierCode).then(
        (response) => {
          this.carrierCode = response.data;
        }
      );
    },
  },
  created() {
    let carrierCode = this.flightOffer.itineraries[0].segments[0].carrierCode;
    if (this.$store.state.flightCarrierCodeCache[carrierCode] !== undefined) {
      this.businessName = this.$store.state.flightCarrierCodeCache[carrierCode];
    } else {
      let businessName = this.getBusinessNameFromCarrierCode(carrierCode);
      this.businessName = businessName;
      this.$store.commit(
        "ADD_FLIGHT_CARRIER_CODE_CACHE",
        carrierCode,
        businessName
      );
    }
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

#flight-offer-card {
  width: 100%;
  background-color: var(--secondary-color);
  border: 1px solid var(--eighth-color);
  padding: 1em;
  display: flex;
  justify-content: space-between;
  gap: 20px;
  border-top: 15px solid var(--eighth-color);
}

span {
  color: var(--primary-color);
}

h2 {
    font-size: 1.25rem;
    display: flex;
    flex-grow: 1;
    flex-wrap: wrap;
    gap: 10px;
}

button {
    background-color: var(--primary-color);
}

button:hover {
    border: 1px solid var(--eighth-color);
    color: var(--eighth-color);
}
</style>