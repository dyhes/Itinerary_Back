package com.hmbb.itinerary.model;

import javax.persistence.*;

@Entity
public class TFlight {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(length = 2)
    private String carrier;

    @Column(length = 4)
    private String flightNo;

    @Column(length = 12)
    private String departureDatetime;

    @Column(length = 12)
    private String arrivalDatetime;

    @Column(length = 3)
    private String departure;

    @Column(length = 3)
    private String arrival;

    public String getDepartureDatetime() {
        return departureDatetime;
    }

    public String getArrivalDatetime() {
        return arrivalDatetime;
    }

    public TFlight() {}

    public TFlight(FlightParam flightParam) {
        this.carrier = flightParam.getCarrier();
        this.flightNo = flightParam.getFlightNo();
        this.departureDatetime = flightParam.getDepartureDatetime();
        this.arrivalDatetime = flightParam.getArrivalDatetime();
        this.departure = flightParam.getDeparture();
        this.arrival = flightParam.getArrival();
    }
}
