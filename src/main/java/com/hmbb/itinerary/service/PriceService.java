package com.hmbb.itinerary.service;

import com.hmbb.itinerary.dao.PriceRepository;
import com.hmbb.itinerary.model.PostResponse;
import com.hmbb.itinerary.model.PriceParam;
import com.hmbb.itinerary.model.TPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PriceService {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public PostResponse insertPrice(PriceParam priceParam){
        priceRepository.save(new TPrice(priceParam));
        return new PostResponse(true,"插入成功");
    }
}
