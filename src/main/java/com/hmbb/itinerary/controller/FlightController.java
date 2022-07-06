package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.service.FlightService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/flight")
    public PostResponse updateFlight(@RequestBody FlightParam flightParam){
        return flightService.insertFlight(flightParam);
    }
}
