<template>
  <main>
    <div style="width: 100vw; display: flex; justify-content: center">
      <img src="spinner.gif" v-if="loading" />
    </div>
    <div>
        <h1>
            Select Destination
        </h1>
    </div>
    <div>
      <destination-card
        v-for="(destination, index) in possibleDestinations"
        :key="index"
        v-bind:destination="destination"
      />
    </div>
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
    --primary-color: #0038FF;
    --secondary-color: #85C4FF;
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

h1 {
    color: var(--primary-color);
    padding-left: .5em;
    padding-top: 1em;
}
</style>