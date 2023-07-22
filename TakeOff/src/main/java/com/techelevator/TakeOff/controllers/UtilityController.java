package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.responses.locations.Location;
import com.techelevator.TakeOff.services.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/utility")
public class UtilityController {

    private CityService cityService;

    public UtilityController(CityService cityService){
        this.cityService = cityService;
    };


    @GetMapping(path="/citySearch")
    public ResponseEntity<List<Location>> getLocationsByKeyword(
            @RequestParam(defaultValue = "") String keyword) {
        if (keyword.isEmpty()) {
            return new ResponseEntity("Request parameter 'keyword' is required.", HttpStatus.BAD_REQUEST);
        }
        return  new ResponseEntity<>(cityService.getLocationsByKeyword(keyword),HttpStatus.OK);
    }

}

