<template>
  <main id="main">
    <div id="hotel-confirm-container">
      <h2 id="message">
        Thank you! Your hotel has been booked. Your confirmation code is:
      </h2>
      <h2 id="confirm-code">{{ confirmationCode }}</h2>
    </div>
  </main>
</template>


<script>
export default {
  data() {
    return {
      confirmationCode: null,
    };
  },
  methods: {
    generateConfirmationCode() {
      const length = 20;
      const characters =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
      let confirmationCode = "";

      for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * characters.length);
        confirmationCode += characters.charAt(randomIndex);
      }

      return confirmationCode;
    },
  },
  created() {
    this.confirmationCode = this.generateConfirmationCode();
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
  height: 100vh;
}

#hotel-confirm-container {
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
  flex-wrap: wrap;
  padding: 5em;
  height: 100vh;
  background-image: url(hotel9_fernando-alvarez-rodriguez-M7GddPqJowg-unsplash.jpg);
  background-size: cover;
  background-position: center center;
}

#message {
  border: 2px solid var(--secondary-color);
  padding: 1em;
  background-color:#0037ff;
}

#confirm-code {
  border: 2px solid var(--secondary-color);
  padding: 1em;
    background-color:#0037ff;

}
</style>