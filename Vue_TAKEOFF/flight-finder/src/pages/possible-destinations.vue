<template>
  <main>
    <div>
      <img id="plane" src="spinner.gif" v-if="loading" />
    </div>
    <div id="heading">
      <h1 v-if="!loading">Select Destination</h1>
    </div>
    

    <div>
      <destination-card
        v-for="(destination, index) in possibleDestinations"
        :key="index"
        v-bind:destination="destination"
      />
    </div>

    <article>
      <div>
        <h2>Things to Consider</h2>
        <div id="three-row">
          <section id="heading">Room Availability:</section>
          <p id="paragraph">
            While we strive to offer real-time room availability, the actual
            availability may vary due to factors such as recent bookings,
            cancellations, or modifications. Therefore, we cannot guarantee that
            a specific room type or package will be available for your preferred
            dates.
          </p>
        </div>
        <div id="three-row">
          <section id="heading">Pricing and Offers:</section>
          <p id="paragraph">
            The prices and special offers displayed on our website are subject
            to change based on various factors, including but not limited to
            seasonal demand, events, promotions, and local regulations. Prices
            may also be influenced by currency fluctuations, taxes, and
            additional fees.
          </p>
        </div>
        <div id="three-row">
          <section id="heading">Third-Party Partners:</section>
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

main {
  background-color: var(--eighth-color);
}

#heading {
  width: 100%;
}

#heading > h1 {
  color: var(--third-color);
  background-color: var(--secondary-color);
  width: 100vw;
  padding: .5em;
}

#plane {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  padding-top: 20em;
  padding-bottom: 22.5em;
}

article {
  padding: 1em;
}

h2 {
  padding-left: 1em;
  color: var(--fifth-color);
  background-color: var(--seventh-color);
  padding: 1em;
}

#three-row {
  display: flex;
  gap: 20px;
  color: white;
  background-color: var(--seventh-color);
  padding: 2em;
}

#heading {
  color: var(--eighth-color);
  font-weight: 600;
  background-color: var(--seventh-color);
  width: 400px;
}
</style>
