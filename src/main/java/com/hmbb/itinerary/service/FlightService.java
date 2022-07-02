package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.FlightDao;
import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    private FlightDao flightDao;

    @Autowired
    public FlightService(@Qualifier("real") FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public PostResponse updateFlight(FlightParam flightParam){
        return flightDao.insertFlight(flightParam);
    }
}
