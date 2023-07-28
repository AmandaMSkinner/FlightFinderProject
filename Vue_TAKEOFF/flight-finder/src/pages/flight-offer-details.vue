<template>
  <main>
      <div id="header-text">
          <h1>Book Your Flight</h1>
      </div>
    <div id="flight-offer">
      <h2><span>Cabin:</span>
      {{ flightOffer.travelerPricings[0].fareDetailsBySegment[0].cabin }}
      </h2>
      <h2><span>Departure:</span>
        {{ loseTheT(flightOffer.itineraries[0].segments[0].departure.at) }}
      </h2>
      <h2><span>Arrival:</span> 
        {{ loseTheT(flightOffer.itineraries[0].segments[0].arrival.at) }}</h2>
    
      <h2><span>Duration:</span>
        {{ fixDuration(flightOffer.itineraries[0].segments[0].duration) }}
      </h2>
      <h2><span>Total:</span> 
      {{ flightOffer.travelerPricings[0].price.total }}
      </h2>
    </div>
    <router-link :to="{name: 'FlightConfirmation'}">
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
      return string.substring(2);
    },

    fixDuration(string) {
      return string.split("PT")[1];
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
  background-image: url(C:\Users\Student\Desktop\FlightFinderProject\Vue_TAKEOFF\flight-finder\public\journey6_aleksei-zaitcev-Nc34cnxcfH0-unsplash.jpg);
  background-position: center center;
  background-size: cover;
  background-repeat: no-repeat;
  width: 100%;

}

#header-text{
    padding-top: 10em;
    display: flex;
    align-items: center;
    justify-content: center;
    color: var(--third-color);

}

#flight-offer {
    position: absolute;
    margin-top: 5em;
    width: 100%;
    height: 200px;
    display: flex;
    gap: 20px;
    background-color: var(--secondary-color);
    padding: 1em;
    justify-content: space-between;
    border: 20px solid var(--eighth-color);
    flex-wrap: wrap;
    align-items: center;
    
    
}

h2 {
    display: flex;
    flex-grow: 1;
    flex-wrap: wrap;
}

span {
    color: var(--primary-color);
    padding-right: 10px;
}

button {
    background-color: var(--primary-color);
    width: 100%;
    padding: 1em;
    margin-top: 17.5em;
}

button:hover {
    border: 2px solid var(--secondary-color);
    color: var(--eighth-color);
}
</style>
