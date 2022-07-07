package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<TPrice,Long> {

    public List<TPrice> findTPricesByCarrierAndDepartureAndArrival(String carrier, String departure, String arrival);
}
