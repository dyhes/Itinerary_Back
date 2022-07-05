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
}
