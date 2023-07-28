<template>
  <main v-if="hotelAndOffer.hotelOffers[0]">
    <section id="hotel-cards">
      <article class="hotel-card">
          
        <!-- <router-link  :to="{name: 'HotelOffers', params: {hotelId:hotel.hotelId}}">
                    <div>{{hotel.hotelId}} - {{ hotel.name }}</div>
                </router-link> -->

        <h2>{{ hotelAndOffer.hotelOffers[0].hotel.name }}</h2>
        <h2>Adults: {{ this.$store.state.hotelPreferencesDto.adults }}</h2>
        <h2>
          Price: ${{ hotelAndOffer.hotelOffers[0].offers[0].price.total }}
        </h2>
        <h2>Check-in: {{ this.$store.state.hotelPreferencesDto.checkIn }}</h2>
        <h2>Check-out: {{ this.$store.state.hotelPreferencesDto.checkOut }}</h2>
        <img
          id="hotel-image"
          src="hotel4_francesca-saraco-_dS27XGgRyQ-unsplash.jpg"
          alt=""
        />

        <router-link
          :to="{
            name: 'HotelOfferDetails',
            params: { offerId: hotelAndOffer.hotelOffers[0].offers[0].id },
          }"
        >
          <button>SEE OFFER DETAILS</button>
        </router-link>
      </article>
    </section>
  </main>
</template>




<script>
export default {
  name: "hotel-cards",
  props: ["hotelAndOffer"],
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
  background-color: var(--eighth-color);
  /* background-image: url(C:\Users\Student\Desktop\FlightFinderProject\Vue_TAKEOFF\flight-finder\public\hotel9_fernando-alvarez-rodriguez-M7GddPqJowg-unsplash.jpg); */
  background-size: cover;
  background-position: center center;
  position: relative;
}

#hotel-image {
  width: 250px;
  height: auto;
}

#hotel-cards {
  background-color: var(--primary-color);
  border: 10px solid var(--primary-color);
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  flex-direction: column;
  font-size: 1.25rem;
  padding: 3em;
  font-size: 0.75rem;
  margin-top: 2em;
}

a:hover {
  color: var(--eighth-color);
}

#hotel-image {
  width: 250px;
  display: flex;
  padding-bottom: 1em;
}

button {
  width: 250px;
  background-color: var(--eighth-color);
  color: black;
  font-weight: 600;
  padding: 1em;
}

button:hover {
  color: var(--primary-color);
  border: 2px solid var(--fifth-color);
}
</style>
