package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.SeatParam;
import com.hmbb.itinerary.service.SeatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    //更新余座
    @PostMapping("/seat/update")
    public PostResponse updateSeat(@RequestBody SeatParam seatParam){
        return seatService.updateSeat(seatParam);
    }

    //插入数据
    @GetMapping("/seat/insert")
    public PostResponse insertSeat(@RequestBody List<SeatParam> seatParams){
        return seatService.insertSeat(seatParams);
    }

    //查询余座信息，懒得搞他就先这样凑活用
    @GetMapping("/seat/show")
    public PostResponse selectSeat(){
        return seatService.showSeat();
    }
}
