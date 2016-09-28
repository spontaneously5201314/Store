package com.spon.service.impl;

import com.spon.domain.Buyer;
import com.spon.mapper.BuyerDAO;
import com.spon.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by myg on 2016/9/27.
 */
@Service("buyerService")
public class BuyerServiceImpl implements BuyerService{

    @Autowired
    private BuyerDAO buyerDAO;

    @Override
    public void registerBuyer(Buyer buyer) {
        buyerDAO.insert(buyer);
    }
}
