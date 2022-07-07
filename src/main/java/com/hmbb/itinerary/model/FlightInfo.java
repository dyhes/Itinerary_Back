package com.hmbb.itinerary.model;

import java.util.ArrayList;
import java.util.List;

public class FlightInfo {

    private String carrier;

    private String flightNo;

    private String departureDatetime;

    private String arrivalDatetime;

    private String departure;

    private String arrival;

    private List<String> cabin = new ArrayList<>();


    private int price;

    private String surcharge;

    private String nextCarrier;

    public FlightInfo(TSeat tSeat,List<String> cabin) {
        this.carrier = tSeat.getCarrier();
        this.flightNo = tSeat.getFlightNo();
        //这里先用Date代替，后面再更新成Datetime
        this.departureDatetime = tSeat.getDepartureDate();
        //this.arrivalDatetime = tSeat.getArrivalDate();
        this.departure = tSeat.getDeparture();
        this.arrival = tSeat.getArrival();
        this.cabin = cabin;
        /*this.price = price;
        this.surcharge = surcharge;
        this.nextCarrier = nextCarrier;*/
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


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(String surcharge) {
        this.surcharge = surcharge;
    }

    public String getNextCarrier() {
        return nextCarrier;
    }

    public void setNextCarrier(String nextCarrier) {
        this.nextCarrier = nextCarrier;
    }
}
