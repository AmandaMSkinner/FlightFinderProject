package com.company;

import com.company.model.ApiData;
import com.company.services.ApiDataService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
	// write your code here
        ApiDataService apidataservice = new ApiDataService();
        apidataservice.fetchAuthToken();//Generate the Authorization Token
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a city");
        String cityQuery = scan.nextLine();
        System.out.println(apidataservice.getCityList(cityQuery));
    }
}
