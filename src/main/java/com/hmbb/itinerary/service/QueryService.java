package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.FlightRepository;
import com.hmbb.itinerary.dao.PriceRepository;
import com.hmbb.itinerary.dao.RuleRepository;
import com.hmbb.itinerary.dao.SeatRepository;
import com.hmbb.itinerary.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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
        //这个是分段数目
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

  //      List<List<TSeat>> flights = new ArrayList<>();
        List<FlightInfo> flightInfos = new ArrayList<>();
        //对每段航班进行操作
        for(int i=0;i<segment;i++){
            //1.挑出来符合日期、出发地和目的地航班，这一步只需要在TSeat表中查询即可完成
            List<TSeat> flight = getAppropriateFlights(departureDates.get(i),departures.get(i),arrivals.get(i));
            //2.对上面的flight进行处理，筛选掉余票不足的并得到每个乘客cabin信息，优先级Y>C>F
            flightInfos = filterSeat(flight,passenger);
            //释放flight内存
            flight.clear();
            flight = null;
            //3.加入具体起飞、降落时间
            flightInfos = addDatetime(flightInfos);
            //4.得到基础票价
            flightInfos = getBasicPrice(flightInfos);
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            //下面进行代理商的相关操作


            //保存该段的航班
    //        flights.add(flight);
        }

        //得到最后的输出：合并同价代理agent，计算同result多segment的总票价

        return null;
    }

    private List<TSeat> getAppropriateFlights(String departureDate, String departure, String arrival){
        return seatRepository.getAppropriateFlights(departureDate,departure, arrival);
    }

    private List<FlightInfo> filterSeat(List<TSeat> flight,int passenger){
        List<String> cabin = new ArrayList<>();
        List<FlightInfo> flightInfos = new ArrayList<>();
        int size = flight.size();
        for(int i = size - 1; i >= 0; i--){

            TSeat item = flight.get(i);

            int seatY = Integer.parseInt(item.getSeatY());
            int seatC = Integer.parseInt(item.getSeatC());
            int seatF = Integer.parseInt(item.getSeatF());

            if(seatY>=passenger){
                for(int h=0;h<passenger;h++){
                    cabin.add("Y");
                }
            }else if(seatY+seatC>=passenger){
                for(int h=0;h<seatY;h++){
                    cabin.add("Y");
                }
                for(int h=0;h<passenger-seatY;h++){
                    cabin.add("C");
                }
            }else if(seatY+seatC+seatF>=passenger){
                for(int h=0;h<seatY;h++){
                    cabin.add("Y");
                }
                for(int h=0;h<seatC;h++){
                    cabin.add("C");
                }
                for(int h=0;h<passenger-seatY-seatF;h++){
                    cabin.add("F");
                }
            }else{
                //加起来都不够，舍去
                flight.remove(item);
                continue;
            }
            flightInfos.add(new FlightInfo(item,cabin));
        }
        return flightInfos;
    }

    private List<FlightInfo> addDatetime(List<FlightInfo> flightInfos){
        TFlight tFlight;
        FlightInfo flightInfo;
        for(int i=0;i<flightInfos.size();i++){
            flightInfo = flightInfos.get(i);
            tFlight = flightRepository.findTFlightByDepartureDatetimeStartingWithAndCarrierAndFlightNoAndDepartureAndArrival(flightInfo.getDepartureDatetime(),flightInfo.getCarrier(),flightInfo.getFlightNo(),flightInfo.getDeparture(),flightInfo.getArrival());
            flightInfo.setDepartureDatetime(tFlight.getDepartureDatetime());
            flightInfo.setArrivalDatetime(tFlight.getArrivalDatetime());
            flightInfos.set(i,flightInfo);
        }
        return flightInfos;
    }

    private List<FlightInfo> getBasicPrice(List<FlightInfo> flightInfos){
        List<TPrice> tPrices;
        FlightInfo flightInfo;
        List<String> cabins;
        for(int i=0;i<flightInfos.size();i++){
            flightInfo = flightInfos.get(i);
            tPrices = priceRepository.findTPricesByCarrierAndDepartureAndArrival(flightInfo.getCarrier(),flightInfo.getDeparture(),flightInfo.getArrival());
            Map<String, String> map = new HashMap<>();
            for(TPrice tPrice:tPrices){
                map.put(tPrice.getCabin(),tPrice.getRealPrice());
            }

            //设置价格
            cabins = flightInfo.getCabin();
            int price=0;
            for(String cabin:cabins){
                price += Integer.getInteger(map.get(cabin));
            }
            flightInfo.setPrice(price);

        }
        return flightInfos;
    }
}
