package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<TPrice,Long> {
}
