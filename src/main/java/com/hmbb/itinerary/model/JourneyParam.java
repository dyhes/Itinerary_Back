package com.hmbb.itinerary.model;

import javax.swing.text.Segment;
import java.util.ArrayList;
import java.util.List;

public class JourneyParam {
    private List<String> agent = new ArrayList<>();

    private int price;

    private List<SegmentParam> segment = new ArrayList();

    public JourneyParam(List<String> agent, int price, List<SegmentParam> segment) {
        this.agent = agent;
        this.price = price;
        this.segment = segment;
    }

    public List<String> getAgent() {
        return agent;
    }

    public void setAgent(List<String> agent) {
        this.agent = agent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<SegmentParam> getSegment() {
        return segment;
    }

    public void setSegment(List<SegmentParam> segment) {
        this.segment = segment;
    }
}
