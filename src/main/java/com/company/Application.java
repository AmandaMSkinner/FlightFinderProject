package com.company;

import com.company.model.responses.Hotel;
import com.company.services.HotelApiService;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // write your code here
        HotelApiService hotelApiService = new HotelApiService();
        hotelApiService.fetchAuthToken();//Generate the Authorization Token
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a city");
        String cityQuery = scan.nextLine();

        List<Hotel> hotels = hotelApiService.getHotelsByCity(cityQuery);
        for (Hotel hotel : hotels)
            System.out.println(hotel);

    }s
}
/*

{ "a" : "b", "c" : "d" }
{ "a" :
    { "b" : "c" }
 }

 { "data" : [ {}, {}, {}, {}] }


 */