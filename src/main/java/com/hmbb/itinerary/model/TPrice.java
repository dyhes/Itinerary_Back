package com.hmbb.itinerary.model;

import javax.persistence.*;

@Entity
public class TPrice {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(length = 2)
    private String carrier;

    @Column(length = 3)
    private String departure;

    @Column(length = 3)
    private String arrival;

    @Column(length = 1)
    private String cabin;

    @Column(length = 8)
    private String amount;

    public TPrice() {}

    public TPrice(PriceParam priceParam) {
        this.carrier = priceParam.getCarrier();
        this.departure = priceParam.getDeparture();
        this.arrival = priceParam.getArrival();
        this.cabin = priceParam.getCabin();
        this.amount = priceParam.getAmount();
    }
}
