import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)




export default new Vuex.Store({
  state: {
   hotelPreferencesDto : {
    iataCode : '',
    adults : 0,
    checkIn : '',
    checkOut : ''
   }
  },
  mutations: {
    SET_HOTEL_PREFERENCES_DTO(state,hotelPreferencesDto) {
        state.hotelPreferencesDto = hotelPreferencesDto;
    }
  },
})