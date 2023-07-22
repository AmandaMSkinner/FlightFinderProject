import axios from 'axios'

export default{
    getIataCode(city){
        let path = "https://test.api.amadeus.com/v1/reference-data/locations/cities";
        return axios.get(path + "?keyword=" + city);
    }
}