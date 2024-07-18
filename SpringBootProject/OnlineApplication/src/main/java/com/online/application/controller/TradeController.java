package com.online.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.application.entity.Order;
import com.online.application.service.TradeService;

@RestController("/order")
public class TradeController {
	@Autowired
    private TradeService tradeService;
	
	  @PostMapping("/place")
	    public Order placeOrder(@RequestBody Order order) {
	        return tradeService.placeOrder(order);
	    }
	
}
