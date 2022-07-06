package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.PriceParam;
import com.hmbb.itinerary.service.PriceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @PostMapping("/price")
    public PostResponse insertPrice(@RequestBody PriceParam priceParam){
        return priceService.insertPrice(priceParam);
    }
}
