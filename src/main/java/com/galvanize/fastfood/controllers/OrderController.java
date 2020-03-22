package com.galvanize.fastfood.controllers;

import com.galvanize.fastfood.entities.Order;
import com.galvanize.fastfood.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }


    //READ

    @GetMapping("orders")
    public List<Order> getAllOrders(){
        List<Order> orders = orderService.getAllOrders();
        return orders;
    }
}
