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
     originInput:'',
     destinationInput:'',
     originLocationCode: '',
     destinationLocationCode: '',
     departureDate: '',
     returnDate: '',
     adults: 0
   },
   flightOffers: [],
   flightCarrierCodeCache: {}
  },
  mutations: {
    SET_HOTEL_PREFERENCES_DTO(state,hotelPreferencesDto) {
        state.hotelPreferencesDto = hotelPreferencesDto;
    },
    SET_FLIGHT_PREFERENCES_DTO(state,flightPreferencesDto){
        state.flightPreferencesDto = flightPreferencesDto;
    },
    SET_FLIGHT_OFFERS_ARRAY(state,flightOffers){
      state.flightOffers = flightOffers;
    },
    ADD_FLIGHT_CARRIER_CODE_CACHE(state,carrierCode,businessName){
      state.flightCarrierCodeCache[carrierCode] = businessName;
    }
  },
  plugins: [vuexLocal.plugin]
})