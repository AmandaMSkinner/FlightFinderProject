import axios from 'axios';

export default {

    getFlights(originLocationCode, destinationLocationCode, departureDate, returnDate, adults) {
        let path = '/flights?originLocationCode='+originLocationCode+'&destinationLocationCode='+destinationLocationCode+'&departureDate='+departureDate+'&returnDate='+returnDate+'&adults='+adults;
        return axios.get(path);
    },

    getFlightsById(id) {
        return axios.get('/flights/' + id);
    },

    searchFlights(searchTerm) {
        if(searchTerm) {
            return axios.get('/flights?name=' + searchTerm);
        }
    },

    convertDateFormat(slashDate) {
        const dt = new Date(slashDate);
        let year = '' + dt.getFullYear();
        let month = '' + (dt.getMonth() + 1);
        let day = '' + (dt.getDate() + 1);

        if (month.length == 1) month = '0' + month;
        if (day.length == 1) day = '0' + day;

        return year + '-' + month + '-' + day;
    }
}
