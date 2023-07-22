<script>
import FlightService from '../services/FlightService.js';
import FlightCards from '../components/FlightCards.vue';

export default {
  name: "FlightDetails",
  components: {
    FlightCards
  },
  data() {
    return {
      flights: [],
      searchTerm: ""
    }
  },
  methods: {
    getFlights() {
      FlightService.getFlights(this.searchTerm).then((response) => {
        this.flights = response.data;
        console.log(this.flights);
      })
      .catch((error) => {
        console.log(error);
      });
    },
    searchFlights(event) {
      if(event.key === "Enter") {
        if(this.searchTerm) {
          FlightService.searchFlights(this.searchTerm).then((response) => {
            this.flights = response.data;
          })
        } else {
          this.getFlights();
        }
      }
    }
  },
  created() {
    this.getFlights();
  }
};
</script>

<template>
  <main>
    <div class="text-box">
      <h4>Browse through flight options</h4>
      <h5>
        Prices displayed include taxes and may change based on availability. You
        can review any additional fees before checkout. Prices are not final
        until you complete your purchase.
      </h5>


      <input 
        class="search-bar"
        type="text"
        placeholder="Search"
        v-model="searchTerm"
        v-on:keydown="searchFlights">
    </div>

    <flight-cards></flight-cards>


  </main>
</template>

<style scoped>
:root {
  --primary-color: #0038ff;
  --secondary-color: #85c4ff;
  --third-color: #ffffff;
  /* --fourth-color: #000000; */
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
    font-size: 1rem;
    padding-top: 1em;
}

.text-box > h5 {
    color: black;
}

.search-bar {
  width: 100%;
  background-color: white;
  border: 1px solid black;
  margin: 1em auto;
  padding: .25em;
}
</style>
