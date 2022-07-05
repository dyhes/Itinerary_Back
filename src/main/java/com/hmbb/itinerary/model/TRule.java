package com.hmbb.itinerary.model;

import javax.persistence.*;

@Entity
public class TRule {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(length = 8)
    private String sequenceNo;

    @Column(length = 2)
    private String carrier;

    @Column(length = 3)
    private String departure;

    @Column(length = 3)
    private String arrival;

    @Column(length = 2)
    private String nextCarrier;

    private String agencies;

    @Column(length = 3)
    private String surcharge;

}
