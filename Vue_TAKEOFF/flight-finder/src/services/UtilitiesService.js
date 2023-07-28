import axios from 'axios'
import store from '../store'
export default{
    getPossibleDestinations(keyword){
        let path = "/utility/citySearch";
        return axios.get(path + "?keyword=" + keyword);
    },

    // getBusinessNamesByCarrierCode(carrierCode) {
    //     return axios.get(`/flights/businessName/${carrierCode}`);
    // }

    getBusinessNamesByCarrierCode(carrierCode) {
        let businessName = '';
        switch (carrierCode)  {
            case 'DL':
                businessName = 'Delta Airlines';
                break;
            case 'F9':
                businessName = 'Frontier Flight';
                break;
            case 'AS':
                businessName = 'Alaska Airlines';
                break;
            case 'NK':
                businessName = 'Spirit Airlines';
                break;
            default:
                businessName = 'Jet Blue Airlines';
        }
        return businessName;
    }
}