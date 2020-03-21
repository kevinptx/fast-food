package services;

import com.sun.tools.javac.code.Attribute;
import entities.Order;
import org.springframework.stereotype.Service;
import repositories.OrderDao;
import entities.Status;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    OrderDao orderDao;

    public OrderService (OrderDao orderDao){
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

