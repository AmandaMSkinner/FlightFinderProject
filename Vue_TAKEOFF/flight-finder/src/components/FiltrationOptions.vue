<template>
    <div class="form-container">
            <h4>Select ammenities for your stay</h4>
            <form action="" method="">
                <star-rating 
                    v-model="rating" 
                    v-bind:max-rating="5"
                    />
                <label for="pool">Pool</label>
                <input type="checkbox" id="pool" name="amenities" value="SWIMMING_POOL" v-model="amenities">
                <label for="gym">Gym</label>
                <input type="checkbox" id="gym" name="amenities" value="FITNESS_CENTER" v-model="amenities">
                <label for="wifi">Wifi</label>
                <input type="checkbox" id="wifi" name="amenities" value="WIFI_IN_ROOM" v-model="amenities">
                <label for="roomservice">Room Service</label>
                <input type="checkbox" id="roomservice" name="amenities" value="ROOM_SERVICE" v-model="amenities">
                <label for="spa">Spa</label>
                <input type="checkbox" id="spa" name="amenities" value="SPA" v-model="amenities">
                <label for="parking">Parking</label>
                <input type="checkbox" id="parking" name="amenities" value="PARKING" v-model="amenities">
                <label for="shuttle">Airport Shuttle Service </label>
                <input type="checkbox" id="shuttle" name="amenities" value="AIRPORT_SHUTTLE" v-model="amenities">
            </form>
        </div>
</template>
<script>
import StarRating from 'vue-star-rating';

    export default {
        components: {
            StarRating
        },
        data() {
            return {
                amenities: [],
                rating: 0
            }
        },
        methods: {
            setRating: function(rating) {
                this.rating = rating;
            }
        }
    }

</script>

<style scoped>

</style>
