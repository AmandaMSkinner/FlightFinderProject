import { createApp } from 'vue'
import './style.css'
import { createRouter, createWebHashHistory } from 'vue-router'
import App from './App.vue'
import Home from './pages/home.vue'
import Flights from './pages/flights.vue'
import Hotels from './pages/hotels.vue'
import Contact from './pages/contact.vue'
import FlightView from './pages/flight-view.vue'
import FlightDetails from './pages/flight-details.vue'
import HotelView from './pages/hotel-view.vue'
import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'
import HotelOffers from './components/HotelOffers.vue'
import axios from 'axios'
import store from './store';
import PossibleDestinations from './pages/possible-destinations.vue'
import HotelOfferDetails from './pages/hotel-offer-details.vue'
import Confirmation from './pages/confirmation.vue'
import PossibleFlightPoints from './pages/possible-flight-points.vue'
import FlightOptions from './pages/flight-options.vue'



const vuetify = createVuetify({
  components,
  directives,
})

const router = createRouter({
    history: createWebHashHistory(),
    routes:   [
      { path: '/', component: Home, name: 'Home'},
      { path: '/hotels', component: Hotels, name: 'Hotels'},
      { path: '/flights', component: Flights, name: 'Flights'},
      { path: '/contact', component: Contact, name: 'Contact'},
      { path: '/flight-details', component: FlightDetails, name: 'FlightDetails'},
      { path: '/flight-view', component: FlightView, name: 'FlightView'},
      { path: '/hotel-view/:iataCode', component: HotelView, name: 'HotelView'},
      { path: '/hotel-offers/:hotelId', component: HotelOffers, name: 'HotelOffers'},
      { path: '/hotel/possible-destinations/:keyword', component: PossibleDestinations, name: 'PossibleDestinations'},
      { path: '/hotel-offer-details/:offerId', component: HotelOfferDetails, name: 'HotelOfferDetails'},
      {path: '/hotel-confirm', component: Confirmation, name:'Confirmation'},
      {path: '/possible-flight-points', component: PossibleFlightPoints, name:'PossibleFlightPoints'},
      {path: '/flight-options', component: FlightOptions, name:'FlightOptions'}

    ]
})

axios.defaults.baseURL = 'http://localhost:8080';

var app = createApp(App)
app.use(router)
app.use(vuetify)
app.use(store);
// app.component('star-rating', VueStarRating.default)
app.mount('#app')

