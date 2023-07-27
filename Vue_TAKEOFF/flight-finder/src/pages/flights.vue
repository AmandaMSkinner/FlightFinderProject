<script>
import UtilitiesService from '../services/UtilitiesService.js'

export default {
 name: "Flights",
 component: {
   UtilitiesService,
 },
 data(){
   return{
     flightPreferencesDto : {
     originLocationCode: '',
     destinationLocationCode: '',
     departureDate: '',
     returnDate: '',
     adults: 0
   }
   };
 },
 methods: {
   seePossibleFlights(){
     this.$store.commit("SET_FLIGHT_PREFERENCES_DTO", this.flightPreferencesDto);
     this.$router.push({name: 'PossibleFlightPoints'});
   }
 }
 }
</script>

<template>
  <div class="destination-container">
    <div class="background-image-container">
      <div class="destination-search-container">
        <h1 class="flight-search-h1">Find Flights From Anywhere</h1>
        <h3 class="flight-search-h3">Let's start your adventure</h3>
        <div class="search-box-flights">
          <i class="uil uil-users-alt"></i>
          <input
            class="number-form-flights"
            type="number"
            min="1"
            placeholder="Select Number Of Passengers"
            v-model="flightPreferencesDto.adults"
            required
          />
        </div>
        <div class="search-box-flights">
          <i class="uil uil-plane-departure"></i>
          <input type="text" placeholder="Leaving From..." 
          v-model="flightPreferencesDto.originInput"
          required />
        </div>
        <div class="search-box-flights">
          <i class="uil uil-plane-departure"></i>
          <input type="text" placeholder="Going To..." 
          v-model="flightPreferencesDto.destinationInput"
          required />
        </div>
        <div class="search-box-flights">
          <i class="uil uil-calendar-alt"></i>
          <input type="date" placeholder="Departure..." 
          v-model="flightPreferencesDto.departureDate"
          required />
        </div>
        <div class="search-box-flights">
          <i class="uil uil-calender"></i>
          <input type="date" placeholder="Return..." 
          v-model="flightPreferencesDto.returnDate"
          required />
        </div>
        <form id="search-flights-form">
          <button @click="seePossibleFlights()" class="search-flights">
              Search Flights
          </button>
        </form>
      </div>
    </div>
  </div>
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

.destination-container {
  height: 100vh;
  display: flex;
  text-align: center;
  justify-content: space-around;
}

.background-image-container {
  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
    url(C:\Users\Student\Desktop\FlightFinderProject\Vue_TAKEOFF\flight-finder\public\flight1_suhyeon-choi-tTfDMaRq-FE-unsplash.jpg);
  background-position: right center;
  background-repeat: no-repeat;
  background-size: cover;
  width: 100%;
}

.destination-search-container {
  padding-top: 9em;
  display: flex;
  align-items: center;
  gap: 20px;
  flex-direction: column;
}

.flight-search-h1 {
  color: var(--third-color);
  text-align: center;
  font-size: 3rem;
  /* margin-top: 1.5em; */
}

.flight-search-h3 {
  color: var(--eighth-color);
  text-align: center;
  font-size: 2rem;
}

.search-box-flights {
  background-color: var(--third-color);
  border-radius: 12px;
  border-color: var(--fourth-color);
  display: flex;
  padding-left: 20px;
  height: 50px;
  width: 400px;
}

.number-form-flights {
  width: 100%;
}

.uil-users-alt {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-plane-departure {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-calendar-alt {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-calender {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.search-flights {
  background-color: var(--primary-color);
  color: var(--fifth-color);
  border-radius: 12px;
  height: 50px;
  width: 430px;
}

.search-flights:hover {
  color: var(--secondary-color);
  background-color: var(--primary-color);
  border: 2px solid var(--secondary-color);
}


</style>
