package com.hmbb.itinerary.model;

import java.util.ArrayList;
import java.util.List;

public class QueryParam {
    private int passenger;
    private int segment;
    private int result;
    private List<String>departureDatetime=new ArrayList<>();
    private List<String>departure=new ArrayList<>();
    private List<String>arrival=new ArrayList<>();
    private List<String>agent=new ArrayList<>();

    public QueryParam(int passenger, int segment, int result, List<String> departureDatetime, List<String> departure, List<String> arrival, List<String> agent) {
        this.passenger = passenger;
        this.segment = segment;
        this.result = result;
        this.departureDatetime = departureDatetime;
        this.departure = departure;
        this.arrival = arrival;
        this.agent = agent;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getSegment() {
        return segment;
    }

    public void setSegment(int segment) {
        this.segment = segment;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<String> getDepartureDatetime() {
        return departureDatetime;
    }

    public void setDepartureDatetime(List<String> departureDatetime) {
        this.departureDatetime = departureDatetime;
    }

    public List<String> getDeparture() {
        return departure;
    }

    public void setDeparture(List<String> departure) {
        this.departure = departure;
    }

    public List<String> getArrival() {
        return arrival;
    }

    public void setArrival(List<String> arrival) {
        this.arrival = arrival;
    }

    public List<String> getAgent() {
        return agent;
    }

    public void setAgent(List<String> agent) {
        this.agent = agent;
    }

    public void log(){
        System.out.println("\"passenger\": 2, //旅客数\n" +
                "    \"segment\": 2, //航段数\n" +
                "    \"departureDatetime\":[\"20221001\",\"20221005\"], //每个航段出发日期\n" +
                "    \"departure\":[\"BJS\",\"SHA\"],  //每个航段出发地\n" +
                "    \"arrival\":[\"SHA\",\"BJS\"],    //每个航段目的地\n" +
                "    \"agent\":[\"BJS001\",\"SHA001\",\"CAN001\"],   //代理人列表\n" +
                "    \"result\":3  //返回结果数");
    }
}
