<template>
    <main>
        <section id="hotel-cards">
            
            <article class="hotel-card" v-for="hotel in hotels" :key="hotel.hotelId">

                <router-link :to="{name: 'HotelOffers', params: {hotelId:hotel.hotelId}}">
                    <div>{{hotel.hotelId}}</div>
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

</style>
