<template>
  <main id="main">
    <div v-if="loading" id="plane-container">
      <img id="plane" src="spinner.gif" />
    </div>
    <div id="heading">
      <h1 v-if="!loading">Select Destination</h1>
    </div>

    <div v-if="!loading">
      <destination-card
        v-for="(destination, index) in possibleDestinations"
        :key="index"
        v-bind:destination="destination"
      />
    </div>

    <article v-if="!loading">
      <div>
        <h2>Things to Consider</h2>
        <div id="three-row">
          <section id="heading-info">Room Availability:</section>
          <p id="paragraph">
            While we strive to offer real-time room availability, the actual
            availability may vary due to factors such as recent bookings,
            cancellations, or modifications. Therefore, we cannot guarantee that
            a specific room type or package will be available for your preferred
            dates.
          </p>
        </div>
        <div id="three-row">
          <section id="heading-info">Pricing and Offers:</section>
          <p id="paragraph">
            The prices and special offers displayed on our website are subject
            to change based on various factors, including but not limited to
            seasonal demand, events, promotions, and local regulations. Prices
            may also be influenced by currency fluctuations, taxes, and
            additional fees.
          </p>
        </div>
        <div id="three-row">
          <section id="heading-info">Third-Party Partners:</section>
          <p id="paragraph">
            Our website may feature links to third-party booking platforms and
            travel agencies. We do not control the information provided on these
            external sites, and their availability and policies may differ from
            ours. We recommend reviewing their terms and conditions before
            making any reservations.
          </p>
        </div>
      </div>
    </article>
  </main>
</template>

<script>
import UtilitiesService from "../services/UtilitiesService";
import DestinationCard from "../components/DestinationCard.vue";
export default {
  components: { DestinationCard },
  data() {
    return {
      possibleDestinations: [],
      loading: false,
    };
  },
  created() {
    this.loading = true;
    UtilitiesService.getPossibleDestinations(this.$route.params.keyword).then(
      (response) => {
        this.possibleDestinations = response.data;
        this.loading = false;
      }
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

#main {
  background-image: url(hotelroom3_marvin-meyer-KCETNsfr4qo-unsplash.jpg);
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  min-height: calc(100vh - 40px);
}

#heading {
  width: 100%;
}

#heading > h1 {
  color: var(--third-color);
  background-color: rgba(0, 0, 0, 0.466);
  width: 100vw;
  padding: 0.5em;
  display: flex;
  align-items: center;
  justify-content: center;
}

#plane-container {
  display: flex;
  align-items: center;
  justify-content: center;
  position: absolute;
  width: 100vw;
  height: calc(100vh);
  top: 0;
  left: 0;
}

article {
  padding: 2em;
  padding-right: 4em;
  padding-left: 4em;
  margin-top: 2em;
}

h2 {
  padding-left: 1em;
  color: var(--fifth-color);
  background-color: #111318de;
  padding: 1em;
  width: 99%;
}

#three-row {
  display: flex;
  gap: 20px;
  color: white;
  background-color: rgba(3, 3, 3, 0.877);
  padding: 2em;
  width: 99%;
}

#heading-info {
  width: 99%;
  display: flex;
  color: var(--third-color);
  font-weight: 600;
  text-align: center;
  align-items: center;
  background-color: #22273bc9;
  width: 400px;
  padding: 0.5em;
}
</style>
