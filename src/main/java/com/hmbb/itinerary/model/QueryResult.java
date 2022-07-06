package com.hmbb.itinerary.model;

import java.util.List;

public class QueryResult {

    private int result;

    private List<JourneyParam> journey;

    public QueryResult(int result, List<JourneyParam> journey) {
        this.result = result;
        this.journey = journey;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<JourneyParam> getJourney() {
        return journey;
    }

    public void setJourney(List<JourneyParam> journey) {
        this.journey = journey;
    }
}
