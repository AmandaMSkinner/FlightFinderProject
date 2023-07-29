<template>
  <main>
    <div id="header-text">
      <h1>Book Your Flight</h1>
    </div>
    <div id="flight-offer">
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
        <span>Duration:</span>
        {{ fixDuration(flightOffer.itineraries[0].segments[0].duration) }}
      </h2>
      <h2>
        <span>Total:</span> ${{ flightOffer.travelerPricings[0].price.total }}
      </h2>
    </div>
    <router-link :to="{ name: 'FlightConfirmation' }">
      <button>BOOK FLIGHT</button>
    </router-link>
  </main>
</template>

<script>
export default {
  data() {
    return {
      flightOffer: this.$store.state.flightOffers.filter((offer) => {
        return offer.id === this.$route.params.id;
      })[0],
    };
  },
  methods: {
    loseTheT(string) {
      return string.split("T")[0]+" @ "+string.split("T")[1];
    },

    fixDuration(string) {
      let hours = string.split("PT")[1].split("H")[0];
      let minutes = string.substring(string.length-3,string.length-1).replace("H","");
      return hours+" Hours "+minutes+" Minutes";
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
  height: 100vh;
  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
    url(journey6_aleksei-zaitcev-Nc34cnxcfH0-unsplash.jpg);
  background-position: center center;
  background-size: cover;
  background-repeat: no-repeat;
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

#header-text {
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--third-color);
}

#flight-offer {
  margin-top: 2em;
  width: 700px;
  height: auto;
  display: flex;
  background-color: rgba(42, 21, 7, 0.582);
  padding: 2em;
  border: 10px solid rgba(170, 9, 9, 0.685);
  flex-wrap: wrap;
  align-items: center;
  color: var(--fifth-color);
  padding-left: 30px;
  font-size: .75rem;
  justify-content: space-between;

}

h2 {
  display: flex;
  flex-grow: 1;
  flex-wrap: wrap;
}

span {
  color: var(--eighth-color);
  padding-right: 10px;
}

button {
  background-color: rgba(0, 0, 0, 0.616);
  width: 700px;
  padding: 1em;
  font-weight: 700;
}

button:hover {
  color: var(--eighth-color);
}
</style>
