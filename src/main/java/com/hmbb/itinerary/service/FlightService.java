package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.FlightRepository;
import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.TFlight;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public PostResponse insertFlight(FlightParam flightParam){
        flightRepository.save(new TFlight(flightParam));
        return new PostResponse(true,"插入成功");
    }
}
