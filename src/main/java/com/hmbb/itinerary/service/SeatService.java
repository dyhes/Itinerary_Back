package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.SeatRepository;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;
import com.hmbb.itinerary.model.TSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class SeatService {

    private final SeatRepository seatRepository;
    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }
    public PostResponse updateSeat(SeatParam seatParam){
        seatRepository.updateSeat(seatParam.getCarrier(),seatParam.getFlightNo(),seatParam.getDeparture(),seatParam.getArrival(),seatParam.getDepartureDate(),seatParam.getSeatF(),seatParam.getSeatC(),seatParam.getSeatY());
        return new PostResponse(true,"余座数据更新成功！");
    }

    public PostResponse insertSeat(List<SeatParam> seatParams){
        List<TSeat> seats = new ArrayList<>();
        for(SeatParam item : seatParams){
            seats.add(new TSeat(item));
        }
        seatRepository.saveAll(seats);
        return new PostResponse(true,"余座数据插入成功！");
    }

    public PostResponse showSeat(){
        List<TSeat> seats = seatRepository.findAll();
        StringBuilder message = new StringBuilder();
        for (TSeat item : seats){
            message.append(item).append("     ");
        }
        return new PostResponse(true,message.toString());
    }
}
