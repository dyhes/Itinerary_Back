package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;

public interface SeatDao {

    PostResponse updateSeat(SeatParam seatParam);

}
