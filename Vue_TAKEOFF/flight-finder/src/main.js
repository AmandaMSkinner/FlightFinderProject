import { createApp } from 'vue'
import './style.css'
import { createRouter, createWebHashHistory } from 'vue-router'
import App from './App.vue'
import Home from './pages/home.vue'
import Flights from './pages/flights.vue'
import Hotels from './pages/hotels.vue'
import Contact from './pages/contact.vue'
import FlightDetails from './pages/flight-details.vue'
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
        { path: '/', component: Home },
        { path: '/hotels', component: Hotels },
        { path: '/flights', component: Flights },
        { path: '/contact', component: Contact },
        { path: '/flight-details/:id', component: FlightDetails }
    ]
})

var app = createApp(App)
app.use(router)
app.use(vuetify)
app.mount('#app')

