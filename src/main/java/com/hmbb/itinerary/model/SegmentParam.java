package com.hmbb.itinerary.model;

import java.util.ArrayList;
import java.util.List;

public class SegmentParam {

    private String carrier;

    private String flightNo;

    private String departureDatetime;

    private String arrivalDatetime;

    private String departure;

    private String arrival;

    private List<String> cabin = new ArrayList<>();

    //使用FlightParam构造
    public SegmentParam(FlightParam flight, List<String> cabin) {
        this.carrier = flight.getCarrier();
        this.flightNo = flight.getFlightNo();
        this.departureDatetime = flight.getDepartureDatetime();
        this.arrivalDatetime = flight.getArrivalDatetime();
        this.departure = flight.getDeparture();
        this.arrival = flight.getArrival();
        this.cabin = cabin;
    }

    //使用TSeat构造，注意，这样构造有两个参数是空的
    public SegmentParam(TSeat tSeat,List<String> cabin){
        this.carrier = tSeat.getCarrier();
        this.flightNo = tSeat.getFlightNo();
/*        this.departureDatetime = tSeat.getDepartureDatetime();
        this.arrivalDatetime = tSeat.getArrivalDatetime();*/
        this.departure = tSeat.getDeparture();
        this.arrival = tSeat.getArrival();
        this.cabin = cabin;
    }

    public SegmentParam(String carrier, String flightNo, String departureDatetime, String arrivalDatetime, String departure, String arrival, List<String> cabin) {
        this.carrier = carrier;
        this.flightNo = flightNo;
        this.departureDatetime = departureDatetime;
        this.arrivalDatetime = arrivalDatetime;
        this.departure = departure;
        this.arrival = arrival;
        this.cabin = cabin;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDepartureDatetime() {
        return departureDatetime;
    }

    public void setDepartureDatetime(String departureDatetime) {
        this.departureDatetime = departureDatetime;
    }

    public String getArrivalDatetime() {
        return arrivalDatetime;
    }

    public void setArrivalDatetime(String arrivalDatetime) {
        this.arrivalDatetime = arrivalDatetime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public List<String> getCabin() {
        return cabin;
    }

    public void setCabin(List<String> cabin) {
        this.cabin = cabin;
    }

}
