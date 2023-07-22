import axios from 'axios';
export default {
    getHotelsByCity(city, [stars], [amenities]){
        let path = 'http://localhost:8080/hotels';
        if(city !== undefined && city !== ''){
            path += `?city=${city};`
        }

        if(stars !== undefined && stars.length !== 0){
            let numbersToAdd = '';

            for(i = 0; i < stars.length; i++){
                if(i = stars.length - 1){
                    numbersToAdd += stars[i];
                } else {
                    numbersToAdd += stars[i] + ',';
                }
               
            }
            path += "&stars=" + numbersToAdd;
        }


        if(amenities !== undefined && amenities !== ''){
            amenititiesToAdd = '';

            for(i=0; i < amenities.length; i++) {
                if(i = amenities.length -1 ) {
                    amenitiesToAdd += amenities[i];
                } else {
                    amenitiesToAdd += amenities[i] + ',';
                }
            }

            path += '&amenities=' + amenitiesToAdd;
        }

        return axios.get(path);
    },

    getHotelOffersByHotelId(hotelId,adults,checkIn,checkOut){
        let path = 'http://localhost:8080/hotels/offers';


        let amenities = [
            SWIMMING_POOL, SPA, FITNESS_CENTER, AIR_CONDITIONING, RESTAURANT, 
            PARKING, PETS_ALLOWED, AIRPORT_SHUTTLE, BUSINESS_CENTER, DISABLED_FACILITIES, WIFI, 
            MEETING_ROOMS, NO_KID_ALLOWED, TENNIS, GOLF, KITCHEN, ANIMAL_WATCHING, BABY-SITTING, 
            BEACH, CASINO, JACUZZI, SAUNA, SOLARIUM, MASSAGE, VALET_PARKING, KIDS_WELCOME, NO_PORN_FILMS,
             MINIBAR, TELEVISION, WI-FI_IN_ROOM, ROOM_SERVICE, GUARDED_PARKG, SERV_SPEC_MENU
        ]



        if(hotelId !== undefined && hotelId !== '') {
            path += '?hotelID=' + hotelId;
        }
        if(adults !== undefined && adults !== '') {
            path += '&adults=' + adults;
        }
        if(checkIn !== undefined && checkIn !== ''){
            path += '&checkIn=' + checkIn;
        }
        if(checkOut !== undefined && checkOut !== ''){
            path += '&checkOut=' + checkOut;
        }
        
        return axios.get(path);
    }
}