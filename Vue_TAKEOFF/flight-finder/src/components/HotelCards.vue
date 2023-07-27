<template>
    <main>
        <section id="hotel-cards">
            
            <article class="hotel-card" v-for="hotel in hotels" :key="hotel.hotelId">

                <router-link :to="{name: 'HotelOffers', params: {hotelId:hotel.hotelId}}">
                    <div>{{hotel.hotelId}} - {{ hotel.name }}</div>
                </router-link>

            </article>

        </section>

    </main>
</template>

<script>
    export default {
        name: 'hotel-cards',
        props: ['hotels'],

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
