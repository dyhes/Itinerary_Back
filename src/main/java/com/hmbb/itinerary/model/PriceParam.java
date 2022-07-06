package com.hmbb.itinerary.model;


public class PriceParam {

    private String carrier;

    private String departure;

    private String arrival;

    private String cabin;

    private String amount;

    public PriceParam(String carrier, String departure, String arrival, String cabin, String amount) {
        this.carrier = carrier;
        this.departure = departure;
        this.arrival = arrival;
        this.cabin = cabin;
        this.amount = amount;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
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

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
