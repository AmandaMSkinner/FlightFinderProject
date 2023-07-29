<template>
  <main v-if="hotelAndOffer.hotelOffers[0]">
    <section id="hotel-cards">
      <article class="hotel-card">
        <!-- <router-link  :to="{name: 'HotelOffers', params: {hotelId:hotel.hotelId}}">
                    <div>{{hotel.hotelId}} - {{ hotel.name }}</div>
                </router-link> -->
        <img
          id="hotel-image"
          src="hotel4_francesca-saraco-_dS27XGgRyQ-unsplash.jpg"
          alt=""
        />
        <h2 id="hotelname">Name: {{ hotelAndOffer.hotelOffers[0].hotel.name }}</h2>
        <h2>Adults: {{ this.$store.state.hotelPreferencesDto.adults }}</h2>
        <h2>
          Price: ${{ hotelAndOffer.hotelOffers[0].offers[0].price.total }}
        </h2>
        <h2>Check-in: {{ this.$store.state.hotelPreferencesDto.checkIn }}</h2>
        <h2>Check-out: {{ this.$store.state.hotelPreferencesDto.checkOut }}</h2>

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
  min-height: calc(100vh- 40px);
  background-color: var(--eighth-color);
  background-size: cover;
  background-position: center center;
  position: relative;
}

#hotel-image {
  width: 250px;
  height: auto;
  display: flex;
}

#hotel-name {
  padding-right: 1em;
}

.hotel-card {
  display: flex;
  justify-content: center;
  font-size: 1.5rem;
  padding: 6em;
  font-size: 0.75rem;
  margin-top: 5em;
  width: 100%;
  align-items: center;
  justify-content: space-between;
  flex-wrap: wrap;
  gap: 20px;
  background-color: rgba(0, 0, 0, 0.815);
}

a:hover {
  color: var(--eighth-color);
}

button {
  width: 250px;
  background-color: var(--eighth-color);
  color: black;
  font-weight: 600;
  padding: 1em;
  font-size: 1rem;
}

button:hover {
  color: var(--primary-color);
}
</style>
