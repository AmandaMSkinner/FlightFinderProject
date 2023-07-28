<template>
  <main>
    <div id="container">      
      <div id="destination-card" v-if="destination.iataCode">
        <h1>{{ destination.name }}</h1>
        <h2>{{ destination.address.stateCode }}</h2>
        <p>{{ destination.iataCode }}</p>
        <button @click="seeHotelsInDestination">SEE HOTELS</button>
      </div>
      
    </div>

    
  </main>
</template>

<script>
export default {
  name: "DestinationCard",
  props: ["destination"],
  data() {},
  methods: {
    seeHotelsInDestination() {
      this.$router.push({
        name: "HotelView",
        params: { iataCode: this.destination.iataCode },
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
  
}


#destination-card {
  background-color: var(--primary-color);
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 20px;
  padding: 1em;
  width: 100%;
  flex-wrap: wrap;
  color: var(--eighth-color);
  margin-bottom: 10px;
}

h1 {
  display: flex;
  flex-grow: 1;
  font-size: 1.5rem;
}

h2 {
  color: white;
}

p {
  color: white;
}

button {
  background-color: var(--sixth-color);
  color: white;
  font-weight: 600;
  padding: 1em;
}

button:hover {
  color: var(--eighth-color);
}

#hotel-details {
  margin-top: 20px;
  padding: 1em;
}

#hotel-details > h3 {
  color: black;
}

#hotel-details > p {
  color: black;
}
</style>