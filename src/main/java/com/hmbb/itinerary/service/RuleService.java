package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.RuleRepository;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.RuleParam;
import com.hmbb.itinerary.model.TRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RuleService {

    private final RuleRepository ruleRepository;

    @Autowired
    public RuleService(RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    public PostResponse insertRule(RuleParam ruleParam){
        ruleRepository.save(new TRule(ruleParam));
        return new PostResponse(true,"插入成功");
    }
}
