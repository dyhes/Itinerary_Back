package com.hmbb.itinerary.model;

public class SeatParam {

    private String carrier;
    private String flightNo;
    private String departure;
    private String arrival;
    private String departureDate;
    private String seatF;
    private String seatC;
    private String seatY;
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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getSeatF() {
        return seatF;
    }

    public void setSeatF(String seatF) {
        this.seatF = seatF;
    }

    public String getSeatC() {
        return seatC;
    }

    public void setSeatC(String seatC) {
        this.seatC = seatC;
    }

    public String getSeatY() {
        return seatY;
    }

    public void setSeatY(String seatY) {
        this.seatY = seatY;
    }

    public SeatParam(String carrier, String flightNo, String departure, String arrival, String departureDate, String seatF, String seatC, String seatY) {
        this.carrier = carrier;
        this.flightNo = flightNo;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDate = departureDate;
        this.seatF = seatF;
        this.seatC = seatC;
        this.seatY = seatY;
    }
}
