package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<TSeat,Long>{
    @Modifying
    @Query(value = "UPDATE TSeat  SET seatF=?6,seatY=?7,seatC=?8 WHERE carrier=?1 AND flightNo=?2 AND departure=?3 AND arrival=?4 AND departureDate=?5")
    void updateSeat(String carrier,String flightNo,String departure,String arrival,String departureDate,String seatF,String seatC,String seatY);

}
