package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<TSeat,Long>{
    @Modifying
    @Query(value = "UPDATE TSeat  SET seatF=?6,seatY=?7,seatC=?8 WHERE carrier=?1 AND flightNo=?2 AND departure=?3 AND arrival=?4 AND departureDate=?5")
    void updateSeat(String carrier,String flightNo,String departure,String arrival,String departureDate,String seatF,String seatC,String seatY);

    @Query(value = "SELECT TSeat FROM TSeat WHERE departureDate=?1 AND departure=?2 AND arrival=?3")
    List<TSeat> getAppropriateFlights(String departureDate, String departure, String arrival);

}
