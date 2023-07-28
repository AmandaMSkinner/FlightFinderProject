<template>
  <main>
    
    <div
      id="hotel-offer-cards"
      v-for="(hotelOffer, index) in hotelOffers"
      v-bind:key="index"
    >
        <h2>
          <span>Total: </span>
          {{
            hotelOffer.price.total.toLocaleString("en-US", {
              style: "currency",
              currency: "USD",
            })
          }}
        </h2>
        <h2>
          <span>Check In:</span>
          {{ hotelOffer.checkInDate }}
        </h2>
        <h2><span>Check Out: </span>
            {{ hotelOffer.checkOutDate }}</h2>
        <h2><span>Room Type:</span>
            {{ hotelOffer.room.typeEstimated.category?.replace("_", " ") }}</h2>
        <h2><span>Beds: </span> 
        {{ hotelOffer.room.typeEstimated.beds }}</h2>
        <h2> <span>Bed Type:</span>
            {{ hotelOffer.room.typeEstimated.bedType }}</h2>

        <button @click="seeOfferDetails(hotelOffer)">SEE OFFER DETAILS</button>
      </div>
 
  </main>
</template>
    
    <script>
export default {
  name: "HotelOfferCard",
  props: ["hotelOffers"],
  data() {},
  methods: {
    seeOfferDetails(hotelOffer) {
      this.$router.push({
        name: "HotelOfferDetails",
        params: { offerId: hotelOffer.id },
      });
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
  background-image: url();
}

#hotel-offer-cards {
  background-color: var(--secondary-color);
  border-top: 20px solid var(--eighth-color);
  display: flex;
  gap: 20px;
  justify-content: space-between;
  flex-wrap: wrap;
  align-items: center;
  width: 99%;
}

h2 {
    display: flex;
    flex-grow: 1;
}

span {
  color: var(--primary-color);
  padding-right: 10px;
}

button {
    background-color: var(--primary-color);
    padding: .5em;
    width: 100%;
}
</style>