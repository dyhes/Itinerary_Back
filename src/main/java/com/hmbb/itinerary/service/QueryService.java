package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.FlightRepository;
import com.hmbb.itinerary.dao.PriceRepository;
import com.hmbb.itinerary.dao.RuleRepository;
import com.hmbb.itinerary.dao.SeatRepository;
import com.hmbb.itinerary.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class QueryService {

    private final FlightRepository flightRepository;
    private final PriceRepository priceRepository;
    private final RuleRepository ruleRepository;
    private final SeatRepository seatRepository;

    @Autowired
    public QueryService(FlightRepository flightService, PriceRepository priceRepository, RuleRepository ruleRepository, SeatRepository seatRepository) {
        this.flightRepository = flightService;
        this.priceRepository = priceRepository;
        this.ruleRepository = ruleRepository;
        this.seatRepository = seatRepository;
    }

    public QueryResult query(QueryParam queryParam) {
        int passenger = queryParam.getPassenger();
        int segment = queryParam.getSegment();
        int result = queryParam.getResult();
        List<String> departureDates =  queryParam.getDepartureDate();
        List<String> departures =  queryParam.getDeparture();
        List<String> arrivals = queryParam.getArrival();
        List<String> agents = queryParam.getAgent();

        /*test front end
        List<JourneyParam>journey=new ArrayList<>();
        List<String>agent=new ArrayList<>();
        agent.add("abc");
        List<SegmentParam>seg=new ArrayList<>();
        List<String>cabin=new ArrayList<>();
        cabin.add("A");
        cabin.add("B");
        seg.add(new SegmentParam("CA","0100","20221101","20231101","sha","BJS",cabin));
        journey.add(new JourneyParam(agent,1234,seg));
        return new QueryResult(1,journey);*/

        List<List<TSeat>> flights = new ArrayList<>();
        //对每段航班进行操作
        for(int i=0;i<segment;i++){
            //1.挑出来符合日期、出发地和目的地且余票充足的航班，这一步只需要在TSeat表中查询即可完成
            List<TSeat> flight = getAppropriateFlights(departureDates.get(i),departures.get(i),arrivals.get(i),passenger);

            //2.对上面的flight进行处理，得到每个乘客cabin信息，优先级Y>C>F

            //3.得到基础票价

            //4.去除flight中代理商不对的航班，并保存其下一段航班


            //保存该段的航班
            flights.add(flight);
        }

        //得到最后的输出：合并同价代理agent，计算同result多segment的总票价

        return null;
    }

    private List<TSeat> getAppropriateFlights(String departureDate, String departure, String arrival, int passenger){
        //List<TFlight> flights = seatRepository;
        return null;
    }
}
