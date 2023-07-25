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
   }
  },
  mutations: {
    SET_HOTEL_PREFERENCES_DTO(state,hotelPreferencesDto) {
        state.hotelPreferencesDto = hotelPreferencesDto;
    }
  },
  plugins: [vuexLocal.plugin]
})