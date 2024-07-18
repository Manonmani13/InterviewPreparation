package com.online.application.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.application.entity.Order;
import com.online.application.entity.OrderStatus;
import com.online.application.service.TradeService;

@Component
public class OrderMessageListener {

    @Autowired
    private TradeService tradeService;

    @RabbitListener(queues = "order-queue")
    public void receiveMessage(Order order) {
        // Process the received order asynchronously
    	tradeService.processOrder(order);
    }
    
}