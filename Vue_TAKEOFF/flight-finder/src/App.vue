<script setup>
</script>

<template>
  <main>
    <header>
      <router-link class="logo" :to="{ path: '/' }"
        >TAKE<span>OFF</span></router-link
      >

      <nav>
        <ul>
          <li><router-link to="/">Home</router-link></li>
          <li><router-link to="/flights">Flights</router-link></li>
          <li><router-link to="/hotels">Hotels</router-link></li>
          <li><router-link to="/contact">Contact</router-link></li>
        </ul>
      </nav>
    </header>

    <div class="main-content">
      <router-view></router-view>
    </div>

    <footer>
      <p>Copyright 2023 TakeOFF</p>
    </footer>
  </main>
</template>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,400;0,700;1,400;1,700&display=swap");
@import url("https://unicons.iconscout.com/release/v4.0.0/css/line.css");

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

.logo {
  display: flex;
  align-items: center;
  justify-content: center;
}

footer > p {
  bottom: 0;
}
</style>