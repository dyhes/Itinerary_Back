package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.SeatDao;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    private final SeatDao seatDao;

    @Autowired
    public SeatService(SeatDao seatDao) {
        this.seatDao = seatDao;
    }

    public PostResponse updateSeat(SeatParam seatParam){
        return this.seatDao.updateSeat(seatParam);
    }
}
