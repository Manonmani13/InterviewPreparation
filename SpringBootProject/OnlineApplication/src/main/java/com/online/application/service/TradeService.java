package com.online.application.service;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.online.application.entity.Order;
import com.online.application.entity.OrderStatus;
import com.online.application.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class TradeService {
	@Autowired
    private OrderRepository orderRepository;
	   @Autowired
	    private RabbitTemplate rabbitTemplate;

	    public Order placeOrder(Order order) {
	        order.setStatus(order.getStatus().PENDING); 
	        Order savedOrder = orderRepository.save(order);

	        rabbitTemplate.convertAndSend("order-exchange", "order-routing-key", savedOrder);

	        return savedOrder;
	    }

	    public void processOrder(Order order) {
	        switch (order.getStatus().toString()) {
	            case "PARTIALLY_FILLED":
	                order.setStatus(order.getStatus().PARTIALLY_FILLED);
	                break;
	            case "REJECTED":
	                order.setStatus(order.getStatus().REJECTED);
	                break;
	            case "FULLY_FILLED":
	                order.setStatus(order.getStatus().FULLY_FILLED);
	                break;
	            default:
	                order.setStatus(order.getStatus().PENDING);
	                break;
	        }

	        orderRepository.save(order);
	    }

}
