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
        <span>Total:</span> ${{ flightOffer.travelerPricings[0].price.total }}
      </h2>

      <button @click="selectOffer">SELECT OFFER</button>
    </div>
  </main>
</template>


<script>
import { getTransitionRawChildren } from "vue";
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
      return string.split("T")[0]+" @ "+string.split("T")[1];
    },
    selectOffer() {
      this.$router.push({
        name: "FlightOfferDetails",
        params: { id: this.flightOffer.id },
      });
    },
    getBusinessNameFromCarrierCode(carrierCode) {
      return UtilitiesService.getBusinessNamesByCarrierCode(carrierCode);
    },
  },
  created() {
    this.businessName = this.getBusinessNameFromCarrierCode(
      this.flightOffer.itineraries[0].segments[0].carrierCode
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

main {
  display: flex;
  flex-wrap: wrap;
  overflow: auto;
}

#flight-offer-card {
  width: calc(100% - 40px);
  margin: 1em;
  background-color: rgba(0, 0, 0, 0.801);
  padding: 1em;
  display: flex;
  justify-content: space-between;
  gap: 20px;
  align-items: center;
  flex-wrap: wrap;
}

span {
  color: var(--fifth-color);
}

h2 {
  font-size: 1.1rem;
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}

button {
  background-color: var(--primary-color);
  padding: 1em;
  color: var(--fifth-color);
  font-weight: 700;
}

button:hover {
  /* border: 2px solid var(--eighth-color); */
  color: var(--eighth-color);
}
</style>