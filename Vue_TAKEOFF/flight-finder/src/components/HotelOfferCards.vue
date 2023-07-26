<template>

    <div v-for="(hotelOffer, index) in hotelOffers" v-bind:key="index">
        <h2> {{ (hotelOffer.price.total).toLocaleString('en-US', { style: 'currency', currency: 'USD'})  }}</h2>
        <h2> {{ hotelOffer.checkInDate }}</h2>
        <h2> {{ hotelOffer.checkOutDate }}</h2>
        <h2> {{  hotelOffer.room.typeEstimated.category?.replace('_', ' ') }}</h2>
        <h2> Beds: {{  hotelOffer.room.typeEstimated.beds }}</h2>
        <h2> {{  hotelOffer.room.typeEstimated.bedType }}</h2>
 

        
        <button @click="seeOfferDetails(hotelOffer)"> SEE OFFER DETAILS </button>

    </div>
    </template>
    
    <script>
    export default {
        name: 'HotelOfferCard',
        props: ['hotelOffers'],
        data() {},
        methods: {
            seeOfferDetails(hotelOffer){
                this.$router.push({ name: 'HotelOfferDetails', params: {offerId: hotelOffer.id}})
            }
        }
    }
    
    
    </script>
    
    
    <style>
    
    </style>