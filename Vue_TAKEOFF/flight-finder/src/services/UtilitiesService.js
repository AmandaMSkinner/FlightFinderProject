import axios from 'axios'

export default{
    getPossibleDestinations(keyword){
        let path = "/utility/citySearch";
        return axios.get(path + "?keyword=" + keyword);
    },

    getBusinessNamesByCarrierCode(carrierCode) {
        return axios.get(`/flights/businessName/${carrierCode}`);
    }

}