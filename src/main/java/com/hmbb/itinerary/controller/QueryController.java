package com.hmbb.itinerary.controller;

import com.hmbb.itinerary.model.QueryParam;
import com.hmbb.itinerary.model.QueryResult;
import com.hmbb.itinerary.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    private final QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    @GetMapping("/query")
    public QueryResult query(@RequestBody QueryParam queryParam){
        queryParam.log();
        return queryService.query(queryParam);
    }
}
