<script>
</script>

<template>
  <div>
    <main>
      <div class="main-container">
        <h1>TAKE<span>OFF</span></h1>
        <h3>Find affordable flights from anywhere in the world</h3>
      </div>

      <div class="search-container">
        <div class="links-search">
          <router-link class="active" :to="'/flights'">Flights</router-link>
          <router-link :to="'/hotels'">Hotels</router-link>
          <input
            name="search-form"
            type="text"
            placeholder="Search.."
            class="search"
          />
        </div>
      </div>

      <div class="destination-container">
        <div class="background-image-container">
          <div class="destination-search-container">
            <h1 class="flight-search-h1">Find Flights From Anywhere</h1>
            <h3 class="flight-search-h3">Let's start your adventure</h3>

            <div class="search-box-flights">
              <i class="uil uil-users-alt"></i>
              <input
                id="number-form-flights"
                type="number"
                min="1"
                placeholder="Select Number Of Passengers"
              />
            </div>

            <div class="search-box-flights">
              <i class="uil uil-plane-departure"></i>
              <input
                id="destination-form-flights"
                type="text"
                placeholder="Going To..."
              />
            </div>

            <div class="search-box-flights">
              <i class="uil uil-calendar-alt"></i>
              <input type="date" placeholder="Arrival..." />
            </div>

            <div class="search-box-flights">
              <i class="uil uil-calender"></i>
              <input type="date" placeholder="Departure..." />
            </div>

            <form id="search-flights-form">
              <button class="search-flights">
                <router-link :to=" {name: 'FlightView'}">
                Search Flights
                </router-link>

              </button>
            </form>
          </div>
        </div>
      </div>

      <hr />

      <div class="three-container">
        <div class="one-of-three">
          <i class="uil uil-moneybag"></i>

          <p class="info-paragraph1">
            From flights to accommodations, we've got you covered. Discover the
            ultimate travel experience with our one-stop-shop. Start planning
            your next adventure today!
          </p>
        </div>

        <div class="two-of-three">
          <i class="uil uil-lightbulb-alt"></i>

          <p class="info-paragraph1">
            Get inspired for your next travel adventure! Our website is a
            treasure trove of exciting destinations and unique experiences. From
            stunning beaches to cultural landmarks, browse our site and let your
            imagination take flight!
          </p>
        </div>

        <div class="three-of-three">
          <i class="uil uil-fire"></i>

          <p class="info-paragraph1">
            Unlock unbeatable deals on flights from around the globe! Browse
            hundreds of discounted flights and jet off to your dream destination
            without breaking the bank. Hurry, these fiery deals won't last!
          </p>
        </div>
      </div>

      <hr />

      <div class="hotel-search-container">
        <div class="background-image-container-hotel">
          <div class="hotel-search">
            <h1 class="hotel-search-h1">Find Hotels with your Flight</h1>
            <h3 class="hotel-search-h3">Create a Package and Save</h3>
          </div>
          <div class="search-box-hotel">
            <i class="uil uil-users-alt"></i>
            <input
              id="number-guests-form-hotel"
              type="number"
              min="1"
              placeholder="Select Number Of Guests"
            />
          </div>
          <div class="search-box-hotel">
            <i class="uil uil-compass"></i>
            <input
              id="city-state-form-hotels"
              type="text"
              placeholder="City/State"
            />
          </div>
          <div class="search-box-hotel">
            <i class="uil uil-bed-double"></i>
            <input type="date" placeholder="Checking in.." />
          </div>
          <div class="search-box-hotel">
            <i class="uil uil-luggage-cart"></i>
            <input type="date" placeholder="Checking out.." />
          </div>

          <form id="search-hotels-form" action="hotel-response.html">
            <button
              onclick="window.location.href='hotel-response.html'"
              class="search-hotels"
            >
              Search Hotels
            </button>
          </form>
        </div>
      </div>

      <section id="info-block">
        <div class="info-block-container">
          <h1 class="info-block-h1">Browse Popular Destinations</h1>
          <p class="info-block-p">
            Looking to plan your next vacation or book a flight? Look no
            further! Our website is your one-stop-shop for all your travel
            needs. With a wide range of destinations and travel options, we make
            it easy for you to plan your dream vacation. Whether you're looking
            for a relaxing beach getaway or an exciting adventure, we have
            everything you need to make your trip unforgettable. So why wait?
            Browse through our website now and start planning your next travel
            adventure today!
          </p>
        </div>
      </section>

    <!-- ::::CODE FOR IMAGE CAROUSEL:::: -->
      <!-- 
            <v-carousel
            cycle
            height="400"
            hide-delimiter-background
            show-arrows="hover"
            >
            <v-carousel-item> Slide 1 </v-carousel-item>

            <v-carousel-item> Slide 2 </v-carousel-item>

            <v-carousel-item> Slide 3 </v-carousel-item>
            </v-carousel> -->
    </main>
  </div>
</template>

    // ::::CODE FOR FLIGHT-DETAILS PAGE::::
     <!-- <li v-for="flight in flights">
    //             <router-link :to="`/flight-details/${flight.id}`">{{flight.name}}</router-link>
    //         </li> -->


<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,400;0,700;1,400;1,700&display=swap");

/* ::::Root Elements:::: */

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

/* ::::Main Section Code:::: */

.main-container {
  height: 100vh;
  background-image: url(airplane1_nikhil-mitra-gssCjrDR5Y4-unsplash.jpg);
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  background-position: center center;
  padding-top: 50vh;
}

.main-container > h1 {
  text-align: center;
  color: var(--third-color);
  font-size: 5rem;
  margin-left: 1.5em;
  margin-top: 1em;
}

span {
  color: var(--eighth-color);
}

.main-container > h3 {
  text-align: center;
  color: var(--primary-color);
  margin-left: 7em;
  margin-top: 1em;
}

.search-container {
  background-color: var(--primary-color);
  height: 6vh;
}

.search {
  background-color: var(--fifth-color);
  margin-right: 5em;
  width: 150px;
}

.links-search {
  background-color: var(--primary-color);
  padding: 1em;
  display: flex;
  justify-content: right;
  justify-content: space-around;
  padding-left: 1em;
}

/* ::::Flights Search Code:::: */

.destination-container {
  height: 100vh;
  display: flex;
  text-align: center;
  justify-content: space-around;
}

.background-image-container {
  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
    url(flight1_suhyeon-choi-tTfDMaRq-FE-unsplash.jpg);
  background-position: right center;
  background-repeat: no-repeat;
  background-size: cover;
  width: 100%;
}

.destination-search-container {
  padding-top: 2em;
  display: flex;
  align-items: center;
  gap: 20px;
  flex-direction: column;
}

.flight-search-h1 {
  color: var(--third-color);
  text-align: center;
  font-size: 3rem;
  padding-left: 0.75em;
}

.flight-search-h3 {
  color: var(--eighth-color);
  text-align: center;
  font-size: 2rem;
  text-align: center;
  padding-left: 1.5em;
}

.search-box-flights {
  background-color: var(--third-color);
  border-radius: 12px;
  border-color: var(--fourth-color);
  display: flex;
  padding-left: 20px;
  height: 50px;
}

#number-form-flights {
  width: 100%;
}

.uil-users-alt {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-plane-departure {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-calendar-alt {
  font-size: 2rem;
  align-self: center;
  color: black;
}

.uil-calender {
  font-size: 2rem;
  align-self: center;
  color: black;
}

#search-flights-form {
  padding-left: 4em;
}

.search-flights {
  background-color: var(--primary-color);
  color: var(--fifth-color);
  border-radius: 12px;
  height: 50px;
  width: 430px;
}

.search-flights:hover {
  color: var(--secondary-color);
  background-color: var(--primary-color);
  border: 2px solid var(--secondary-color);
}

/* ::::HOTEL SEARCH CODE:::: */

.hotel-search-container {
  background-color: var(--fifth-color);
  height: 100vh;
  display: flex;
  text-align: center;
  justify-content: space-around;
  align-items: stretch;
}

.background-image-container-hotel {
  background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
    url('hotel2_vojtech-bruzek-Yrxr3bsPdS0-unsplash.jpg');
  background-position: right center;
  background-repeat: repeat;
  background-size: cover;
  width: 100%;
}

.hotel-search {
  padding-top: 10em;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  flex-direction: column;
  padding-bottom: 2em;
}

.search-box-hotel {
  background-color: white;
  border-radius: 12px;
  border-color: var(--fourth-color);
  display: flex;
  padding-left: 10px;
  height: 50px;
  align-items: center;
  width: 400px;
}

.hotel-search-h1 {
  color: var(--third-color);
  text-align: center;
  font-size: 3rem;
}

.hotel-search-h3 {
  color: red;
  text-align: center;
  font-size: 2rem;
}

#number-guests-form-hotel {
  width: 100%;
}

.uil-compass {
  font-size: 2rem;
  color: black;
}

.uil-bed-double {
  font-size: 2rem;
  color: black;
}

.uil-luggage-cart {
  font-size: 2rem;
  color: black;
}

.search-hotels {
  background-color: var(--primary-color);
  border-radius: 12px;
  border-color: var(--primary-color);
  display: flex;
  height: 50px;
  width: 430px;
  align-self: center;
  justify-content: center;
  align-items: center;
  font-size: 1rem;
}

.search-hotels:hover {
  color: var(--secondary-color);
  background-color: var(--primary-color);
  border: 2px solid var(--secondary-color);
}

/* ::::Three Section Container:::: */

.three-container {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
  padding: 3em 2em;
  align-content: space-between;
  gap: 55px;
  padding-bottom: 4em;
  background-color: var(--seventh-color);
}

.one-of-three {
  font-size: 16px;
  line-height: 1.5;
  text-align: center;
  display: flex;
  width: 400px;
  max-height: 600px;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
}

.two-of-three {
  font-size: 16px;
  line-height: 1.5;
  text-align: center;
  display: flex;
  width: 400px;
  max-height: 600px;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
}

.three-of-three {
  font-size: 16px;
  line-height: 1.5;
  text-align: center;
  display: flex;
  width: 400px;
  max-height: 600px;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
}

.uil-moneybag {
  font-size: 3rem;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
  padding-bottom: 0.5em;
  color: white;
}

.uil-fire {
  font-size: 3rem;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
  padding-bottom: 0.5em;
  color: white;
}

.uil-lightbulb-alt {
  font-size: 3rem;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
  padding-bottom: 0.5em;
  color: white;
}

/* ::::Browse Popular Destinations Container:::: */

.info-block-container {
  background-color: var(--seventh-color);
  padding: 4em 4em;
  text-align: center;
  justify-content: space-between;
  gap: 40px;
}

.info-block-h1 {
  color: var(--third-color);
  font-size: 3rem;
}

.info-block-p {
  color: var(--third-color);
  text-align: center;
  font-size: 1rem;
}

/* .info-section-top {
  height: 5vh;
  padding: 4em 4em;
} */

/* .info-paragraph1 {
  color: white;
  text-align: center;
  width: 100%;
} */

.break-section2 {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 20vh;
  background-color: var(--fourth-color);
}

.heading-title {
  width: 100%;
  background-color: var(--fourth-color);
  color: var(--third-color);
}

.break-section2-heading {
  text-align: center;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-around;
}

.break-section2-heading3 {
  text-align: center;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-around;
}

.popular-destination-container {
  display: flex;
  width: 100%;
  background-color: var(--fourth-color);
  align-items: center;
  justify-content: center;
}

.row {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
  padding: 1em 1em;
}

.column {
  padding-left: 3em;
  padding: 1em;
  display: flex;
  align-items: center;
  justify-content: center;
}

.image-block {
  width: 325px;
  height: 225px;
  display: flex;
  align-items: center;
  gap: 30px;
  justify-content: center;
}

.image-block:hover {
  cursor: pointer;
  border-bottom: 3px solid var(--sixth-color);
}

@media (min-width: 375px) {
  .main-container h1 {
    text-align: center;
    margin-bottom: 0;
    margin-left: 0em;
  }

  .main-container h3 {
    margin-top: 0;
    font-size: 1rem;
    text-align: center;
    margin-left: 0em;
  }

  .flight-search-h1 {
    padding: 1em;
  }

  .flight-search-h3 {
    padding-right: 2em;
  }

  .search-box-flights {
    width: 400px;
  }

  .search-flights {
    margin-left: -4em;
  }

  .hotel-search {
  }

  .hotel-search-h1 {
    font-size: 3rem;
  }

  .search-box-hotel {
    width: 400px;
    margin: 0 auto 1em auto;
  }

  .search-hotels {
    margin: 0 auto;
    background-color: var(--primary-color);
  }
}

@media screen and (min-width: 800px) {
  .main-container h1 {
    text-align: center;
    margin-bottom: 0;
    margin-left: 0.25em;
  }

  .main-container h3 {
    margin-top: 0;
    font-size: 1rem;
    text-align: center;
    margin-left: 1em;
  }

  .flight-search-h1 {
    margin-left: 0.5em;
  }

  .flight-search-h3 {
    margin-left: 1em;
  }

  .search-box {
    margin-left: 2em;
  }

  .search-flights {
    margin-left: -4em;
  }

  .search {
    background-color: var(--fifth-color);
    margin-right: 1em;
    width: 350px;
  }

  .img-carousel-container {
    width: 100%;
  }

  .img-carousel div {
    width: 100%;
  }
}

@media (min-width: 1200px) {
  .main-container h1 {
    padding-left: 10%;
    text-align: left;
    margin-top: -0.5em;
    margin-left: -1em;
  }

  .main-container h3 {
    padding-left: 65%;
    margin-top: -5em;
    text-align: left;
  }

  .search-box {
    width: 400px;
  }

  .hotel-search h3 {
    margin-top: 0;
  }

  .info-block-p {
    padding-right: 12em;
  }
}
</style>
