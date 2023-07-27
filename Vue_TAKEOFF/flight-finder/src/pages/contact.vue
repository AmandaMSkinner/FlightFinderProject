
<template>
  <main id="main-div">
    <h2 id="contact-header">Contact</h2>


 
    <form id="contact-form" ref="form" @submit.prevent="sendEmail">
        <label class="contact-form-label"> First Name:
        <input type="text" v-model="firstName" name="firstName" placeholder="First" />
        </label>
        <label class="contact-form-label"> Last Name:
        <input type="text" v-model="lastName" name="lastName" placeholder="Last" />
        </label>
        <label class="contact-form-label"> Email:
        <input type="email" v-model="email" name="email" placeholder="Email" />
        </label>
        <label class="contact-form-label"> Message:
        <input type="text" v-model="message" name="message" id="concerns" placeholder="" />
        </label>
        <br>
        <input type="submit" value="Send" id="submit-button">
    </form>
   
  </main>

</template>

<script>
import emailjs from 'emailjs-com';

export default {
  name: 'ContactUs',
  data() {
    return {
      firstName: '',
      lastName: '',
      email: '',
      message: ''
    }
  },
  methods: {
    sendEmail(e) {
      try {
        emailjs.sendForm('service_gtdhnck', 'template_9g0nnll', this.$refs.form,
        'hEyRWctJMpmeXNVCK', {
          firstName: this.firstName,
          lastName: this.lastName,
          email: this.email,
          message: this.message
        })

      } catch(error) {
          console.log({error})
      }
      // Reset form field
      this.firstName = ''
      this.lastName = ''
      this.email = ''
      this.message = ''
    },
  }
}
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

#main-div {
    background-image: url("/contact-4.jpeg");
    height: 100vh;
    background-size: 2000px;
    background-position: center center;
    background-repeat: no-repeat;
}


#contact-header {
    padding-top: 3em;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 3rem;
    color: var(--eighth-color);
}

#contact-form {
    margin-top: 2em;
    background-color: var(--primary-color);
    padding: 1em;
    background: linear-gradient(rgba(0, 0, 0, 0.322), rgba(0, 0, 0, 0.548));
}

.contact-form-label {
    background-color: white;
    color: black;
    display: flex;
    width: 400px;
    margin: 1em auto;
    padding: .5em;
    gap: 10px;

}

#concerns {
    height: 10vh;
    width: 100%;
    

}

#submit-button {
    background-color: var(--primary-color);
    padding: 1em;
    display: flex;
    width: 400px;
    margin: 1em auto;
    justify-content: center;
    border-radius: 10px;
}

#submit-button:hover {
  color: var(--secondary-color);
  background-color: var(--primary-color);
  border: 2px solid var(--secondary-color);
}
</style>
