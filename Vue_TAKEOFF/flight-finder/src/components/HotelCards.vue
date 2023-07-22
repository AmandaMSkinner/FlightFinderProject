<template>
    <main>
        <section id="hotel-cards">
            <article class="hotel-card" v-for="hotel in hotels" :key="hotel.hotelId">
                <div>{{hotel.hotelId}}</div>

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
