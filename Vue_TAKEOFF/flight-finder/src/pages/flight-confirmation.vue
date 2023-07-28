<template>
  <main id="flight-confirm-main">
    <div id="confirm-container">
      <h2>
        Thank you! Your flight has been booked. Your confirmation code is:
      </h2>
      <h2>{{ confirmationCode }}</h2>
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

#flight-confirm-main {
    background-color: var(--primary-color);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    padding: 1em;
}

#confirm-container {
    border: 3px solid var(--eighth-color);
}
</style>

