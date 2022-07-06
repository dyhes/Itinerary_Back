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

    public TRule() {}

    public TRule(RuleParam ruleParam) {
        this.sequenceNo = ruleParam.getSequenceNo();
        this.carrier = ruleParam.getCarrier();
        this.departure = ruleParam.getDeparture();
        this.arrival = ruleParam.getArrival();
        this.nextCarrier = ruleParam.getNextCarrier();
        this.agencies = ruleParam.getAgencies();
        this.surcharge = ruleParam.getSurcharge();
    }
}
