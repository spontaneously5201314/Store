package com.spon.web;

import com.spon.domain.Buyer;
import com.spon.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by myg on 2016/9/27.
 */
@Controller
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;


    @RequestMapping(value = "/login")
    public String login(){
//        System.out.println("调用");
//        return "register";
        return "success";
    }

    @RequestMapping("/listBuyerMessage")
    public String listBuyerMessage(@RequestParam String username, @RequestParam String password){
        return "buyer/listBuyerMessage";
    }

    @RequestMapping("/registerBuyer")
    public String registerBuyer(@RequestParam String username, @RequestParam String password, @RequestParam String email){
        Buyer buyer = new Buyer();
        buyer.setUsername(username);
        buyer.setPassword(password);
        buyer.setEmail(email);
        buyerService.registerBuyer(buyer);
        return "success";
    }
}
