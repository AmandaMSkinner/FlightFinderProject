import axios from 'axios';

export default {

    getFlights() {
        return axios.get('/flights');
    },

    getFlightsById(id) {
        return axios.get('/flights/' + id);
    },

    searchFlights(searchTerm) {
        if(searchTerm) {
            return axios.get('/flights?name=' + searchTerm);
        }
    }
}
