package com.hmbb.itinerary.dao;

import com.hmbb.itinerary.model.TRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<TRule,Long> {
}
