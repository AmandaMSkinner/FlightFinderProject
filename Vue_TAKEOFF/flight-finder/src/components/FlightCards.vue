<template>
  <main>
    <h1>Flight Details</h1>

    <section id="flight-cards">
      <article class="flight-card" v-for="flight in flights" :key="flight.id">
        <div class="airline" v-on:click="showDetails(flight.id)">
          {{ flight.airline }}
        </div>
      </article>
    </section>
  </main>
</template>

<script>
export default {
  name: "flight-cards",
  props: ["flights"],
  methods: {
    showDetails(id) {
      this.$router.push({ name: "FlightDetails", params: {id: id}});
    },
    currency(value) {
        return new Intl.NumberFormat(`en-US`, {
            currency: `USD`,
            style: "currency",
        }).format(value);
    }
  }
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

main > h1 {
  color: black;
  font-size: 1.5rem;
}
</style>