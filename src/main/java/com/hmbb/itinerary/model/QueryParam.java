package com.hmbb.itinerary.model;

import java.util.ArrayList;
import java.util.List;

public class QueryParam {
    private int passenger;
    private int segment;
    private int result;
    private List<String>departureDate=new ArrayList<>();
    private List<String>departure=new ArrayList<>();
    private List<String>arrival=new ArrayList<>();
    private List<String>agent=new ArrayList<>();

    public QueryParam(int passenger, int segment, int result, List<String> departureDate, List<String> departure, List<String> arrival, List<String> agent) {
        this.passenger = passenger;
        this.segment = segment;
        this.result = result;
        this.departureDate = departureDate;
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
    public List<String> getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(List<String> departureDate) {
        this.departureDate = departureDate;
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

    private void listLog(List<String>list){
        for(String s:list){
            System.out.println(s);
        }
    }

    public void log(){
        System.out.println("passenger");
        System.out.println(passenger);
        System.out.println("segment");
        System.out.println(segment);
        System.out.println("result");
        System.out.println(result);
        System.out.println("departureDate");
        listLog(departureDate);
        System.out.println("departure");
        listLog(departure);
        System.out.println("arrival");
        listLog(arrival);
        System.out.println("agent");
        listLog(agent);
    }
}
