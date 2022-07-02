package com.hmbb.itinerary.dao.impl;

import com.hmbb.itinerary.dao.FlightDao;
import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import org.springframework.stereotype.Repository;

@Repository("real")
public class FlightDaoImpl implements FlightDao {
    @Override
    public PostResponse insertFlight(FlightParam flightParam) {
        //与数据库交互逻辑
        //...

        return new PostResponse(true,"from real");
    }
}
