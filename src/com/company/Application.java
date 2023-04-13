package com.company;

import com.company.model.ApiData;
import com.company.services.ApiDataService;

public class Application {

    public static void main(String[] args) {
	// write your code here
        ApiDataService apidataservice = new ApiDataService();
        apidataservice.getApiData("yell");
    }
}
