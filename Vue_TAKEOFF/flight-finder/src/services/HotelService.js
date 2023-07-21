import axios from 'axios';

export default {

    goToJaxAndSwim(){
        return axios.get('http://localhost:8080/hotels?city=JAX&amenities=SWIMMING_POOL');
    },
    getHotelOffers(hotelId){
        return axios.get('http://localhost:8080/hotels/offers?adults=1&checkIn=2023-07-27&checkOut=2023-07-28&hotelID=' + hotelId);
    }

}