import { createApp } from 'vue'
import './style.css'
import { createRouter, createWebHashHistory } from 'vue-router'
import App from './App.vue'
import Home from './pages/home.vue'
import Flights from './pages/flights.vue'
import Hotels from './pages/hotels.vue'
import Contact from './pages/contact.vue'
import FlightDetails from './pages/flight-details.vue'
import HotelDetails from './pages/hotel-details.vue'
import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'

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
        { path: '/flight-details/:id', component: FlightDetails, name: 'FlightDetails'},
        { path: '/hotel-details/:id', component: HotelDetails, name: 'HotelDetails'}
    ]
})

var app = createApp(App)
app.use(router)
app.use(vuetify)
app.mount('#app')

