package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.RuleParam;
import com.hmbb.itinerary.service.RuleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RuleController{

    private final RuleService ruleService;

    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping("/rule")
    public PostResponse insertRule(RuleParam ruleParam){
        return ruleService.insertRule(ruleParam);
    }
}
