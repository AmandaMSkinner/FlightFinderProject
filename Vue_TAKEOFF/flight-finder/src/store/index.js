import { createStore } from 'vuex';
import VuexPersistance from 'vuex-persist';

const vuexLocal = new VuexPersistance({
  storage: window.localStorage
});

export default createStore({
  state: {
   hotelPreferencesDto : {
    iataCode : '',
    adults : 0,
    checkIn : '',
    checkOut : ''
   },
   flightPreferencesDto : {
     originLocationCode: '',
     destinationLocationCode: '',
     departureDate: '',
     returnDate: '',
     adults: 0
   }
  },
  mutations: {
    SET_HOTEL_PREFERENCES_DTO(state,hotelPreferencesDto) {
        state.hotelPreferencesDto = hotelPreferencesDto;
    },
    SET_FLIGHT_PREFERENCES_DTO(state,flightPreferencesDto){
        state.flightPreferencesDto = flightPreferencesDto;
    }
  },
  plugins: [vuexLocal.plugin]
})