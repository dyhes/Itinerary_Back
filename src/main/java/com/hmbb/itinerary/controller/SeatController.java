package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;
import com.hmbb.itinerary.service.SeatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PostMapping("/seat")
    public PostResponse updateSeat(@RequestBody SeatParam seatParam){
        return seatService.updateSeat(seatParam);
    }
}
