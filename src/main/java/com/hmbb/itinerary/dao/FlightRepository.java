package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<TFlight,Long> {

    public TFlight findTFlightByDepartureDatetimeStartingWithAndCarrierAndFlightNoAndDepartureAndArrival(String departureDate,String carrier,String flightNo,String departure,String arrival);
}
