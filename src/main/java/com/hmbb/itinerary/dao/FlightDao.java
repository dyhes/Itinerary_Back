package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;

public interface FlightDao {
    PostResponse insertFlight(FlightParam flightParam);
}
