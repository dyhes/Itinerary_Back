package com.hmbb.itinerary.dao.impl;

import com.hmbb.itinerary.dao.SeatDao;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;
import org.springframework.stereotype.Repository;

@Repository
public class SeatDaoImpl implements SeatDao {
    @Override
    public PostResponse updateSeat(SeatParam seatParam) {
        //更新座位，这里的seatParam中的三个seat值是变化量

        return new PostResponse(true,"from real");
    }
}
