package com.galvanize.controllers;

import com.galvanize.dto.OrderRequest;
import com.galvanize.entities.Order;
import com.galvanize.entities.Status;
import com.galvanize.services.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }



    // CREATE


    @PostMapping(value = "/orders", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Order postOrder(@RequestBody OrderRequest orderRequest){
        // pull two data fields off the request body object
        String customerName = orderRequest.getCustomerName();
        String description = orderRequest.getDescription();
        // set remaining values for constructor
        String createdAt = "";
        Enum status = Status.PENDING;
        String lastUpdated = "";
        Order newOrder = new Order(customerName, createdAt, status, description, lastUpdated);
        Order order = orderService.createOrder(newOrder);
        return order;
    }


    //READ

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        List<Order> orders = orderService.getAllOrders();
        return orders;
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable long id){
        Order order = orderService.getOrder(id);
        return order;
    }


    // UPDATE
    @PutMapping("/orders{id}")
    public Order updateOrderStatus(@PathVariable Long id, @RequestBody OrderUpdate update){
        //pull data fields off the request body object
        String customerName = updateOrderStatus().getCustomerName();
        Status status = update.getStatus();
        String note = update.getNote();
        Order order = orderService.updateOrder(id, customerName, status, note);
        return order;
    }
}
