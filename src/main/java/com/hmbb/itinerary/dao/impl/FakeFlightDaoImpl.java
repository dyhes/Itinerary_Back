package com.hmbb.itinerary.dao.impl;

import com.hmbb.itinerary.dao.FlightDao;
import com.hmbb.itinerary.model.FlightParam;
import com.hmbb.itinerary.model.PostResponse;
import org.springframework.stereotype.Repository;

//仅需修改FlightService构造器上的@Qualifier上的内容就能在同一接口的不同实现间切换，可在数据库接口尚未完成时使用死数据测试
@Repository("fake")
public class FakeFlightDaoImpl implements FlightDao {
    @Override
    public PostResponse insertFlight(FlightParam flightParam) {
        //与数据库交互逻辑
        //...

        return new PostResponse(true,"from fake");
    }
}
