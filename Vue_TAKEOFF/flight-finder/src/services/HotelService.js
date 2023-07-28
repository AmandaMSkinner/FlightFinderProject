import axios from 'axios';
export default {
    getHotelsByCity(city, stars, amenities){
        let path = '/hotels';
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
        let path = '/hotels/offers';


        path += '?hotelID=' + hotelId;
      
        if(adults !== undefined && adults !== '') {
            path += '&adults=' +  adults;
        }
        if(checkIn !== undefined && checkIn !== ''){
            path += '&checkIn=' + this.convertDateFormat(checkIn);
        }
        if(checkOut !== undefined && checkOut !== ''){
            path += '&checkOut=' + this.convertDateFormat(checkOut);
        }
        
        return axios.get(path);
    },
    convertDateFormat(slashDate) {
        const dt = new Date(slashDate);
        let year = '' + dt.getFullYear();
        let month = '' + (dt.getMonth() + 1);
        let day = '' + (dt.getDate() + 1);

        if (month.length == 1) month = '0' + month;
        if (day.length == 1) day = '0' + day;

        return year + '-' + month + '-' + day;
    },

    getHotelOfferDetailsByOfferId(offerId) {
        let path = 'hotels/offerDetails/';

        return axios.get(path + offerId);
    },

    getHotelsAndOffers(iataCode,adults,checkIn,checkOut) {
        let path = "/hotels/hotelsAndOffers";

        path += '?city=' + iataCode;
      
        if(adults !== undefined && adults !== '') {
            path += '&adults=' +  adults;
        }
        if(checkIn !== undefined && checkIn !== ''){
            path += '&checkIn=' + this.convertDateFormat(checkIn);
        }
        if(checkOut !== undefined && checkOut !== ''){
            path += '&checkOut=' + this.convertDateFormat(checkOut);
        }

        return axios.get(path);
    }
}