<template>
    <main v-if="hotelAndOffer.hotelOffers[0]">
        <section id="hotel-cards" >
            
            <article class="hotel-card">

                <!-- <router-link  :to="{name: 'HotelOffers', params: {hotelId:hotel.hotelId}}">
                    <div>{{hotel.hotelId}} - {{ hotel.name }}</div>
                </router-link> -->

                <h2>{{ hotelAndOffer.hotelOffers[0].hotel.name }}</h2>
                <h2>{{ hotelAndOffer.hotelOffers[0].offers[0].price.total }}</h2>
                <h2>{{ this.$store.state.hotelPreferencesDto.adults }}</h2>
                <h2>{{ this.$store.state.hotelPreferencesDto.checkIn }}</h2>
                <h2>{{ this.$store.state.hotelPreferencesDto.checkOut }}</h2>
                <img src="hotel4_francesca-saraco-_dS27XGgRyQ-unsplash.jpg" alt="">

                <router-link :to="{name:'HotelOfferDetails', params: {offerId:hotelAndOffer.hotelOffers[0].offers[0].id}}">
                <button>SEE OFFER DETAILS</button>
                </router-link>
            </article>

        </section>

    </main>
</template>




<script>
    export default {
        name: 'hotel-cards',
        props: ['hotelAndOffer'],

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

main {
    height: 100vh;
    background-color: var(--eighth-color);
    background-image: url(C:\Users\Student\Desktop\FlightFinderProject\Vue_TAKEOFF\flight-finder\public\hotel9_fernando-alvarez-rodriguez-M7GddPqJowg-unsplash.jpg);
    background-size: cover;
    background-position: center center;
    position: relative;
}

#hotel-cards {
    background-color: var(--primary-color);
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    flex-direction: column;
    font-size: 1.25rem;
    padding: 1em;
}

a:hover {
    color: var(--eighth-color);
}
</style>
