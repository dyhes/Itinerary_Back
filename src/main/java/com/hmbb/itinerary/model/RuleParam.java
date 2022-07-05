package com.hmbb.itinerary.model;

import javax.persistence.Column;

public class RuleParam {

    private String sequenceNo;

    private String carrier;

    private String departure;

    private String arrival;

    private String nextCarrier;

    private String agencies;

    private String surcharge;

    public RuleParam(String sequenceNo, String carrier, String departure, String arrival, String nextCarrier, String agencies, String surcharge) {
        this.sequenceNo = sequenceNo;
        this.carrier = carrier;
        this.departure = departure;
        this.arrival = arrival;
        this.nextCarrier = nextCarrier;
        this.agencies = agencies;
        this.surcharge = surcharge;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
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

    public String getNextCarrier() {
        return nextCarrier;
    }

    public void setNextCarrier(String nextCarrier) {
        this.nextCarrier = nextCarrier;
    }

    public String getAgencies() {
        return agencies;
    }

    public void setAgencies(String agencies) {
        this.agencies = agencies;
    }

    public String getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(String surcharge) {
        this.surcharge = surcharge;
    }
}
