package com.hmbb.itinerary.model;

import javax.persistence.*;

@Entity
public class TSeat {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(length = 3,nullable = false)
    private String carrier;

    @Column(length = 4)
    private String flightNo;

    @Column(length = 3)
    private String departure;

    @Column(length = 3)
    private String arrival;

    @Column(length = 8)
    private String departureDate;

    @Column(length = 1)
    private String seatF;

    @Column(length = 1)
    private String seatC;

    @Column(length = 1)
    private String seatY;

    public TSeat(){}

    public TSeat(SeatParam seatParam) {
        this.carrier = seatParam.getCarrier();
        this.flightNo = seatParam.getFlightNo();
        this.departure = seatParam.getDeparture();
        this.arrival = seatParam.getArrival();
        this.departureDate = seatParam.getDepartureDate();
        this.seatF = seatParam.getSeatF();
        this.seatC = seatParam.getSeatC();
        this.seatY = seatParam.getSeatY();
    }
}
