import { createStore } from 'vuex';

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
})