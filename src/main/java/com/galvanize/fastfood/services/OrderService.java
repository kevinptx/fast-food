package com.galvanize.fastfood.services;

import com.galvanize.fastfood.entities.Order;
import com.galvanize.fastfood.entities.Status;
import com.galvanize.fastfood.repository.OrderDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    OrderDao orderDao;

    public OrderService(OrderDao orderDao){
        this.orderDao = orderDao;
    }

    public Order createOrder(Order order){
        return orderDao.save(order);
    }

    public Order getOrder(Long id){
        Optional<Order> order = orderDao.findById(id);
        return order.orElse(null);
    }

    public List<Order> getAllOrders(){
        return orderDao.findAll();
    }

    public Order assign(Long id, String status){
        Order order = getOrder(id);
        order.setStatus(Status.valueOf(status));
        Order savedOrder = orderDao.saveAndFlush(order);
        return savedOrder;
    }
}

