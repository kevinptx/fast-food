package services;

import entities.Order;
import entities.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import repositories.OrderDao;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
//@Transactional
@SpringBootConfiguration
class OrderServiceTest {

//    @MockBean
//    OrderDao orderDao;
    @Autowired
    OrderService orderService;

    Order order;
    Order order1;
    Order order2;

    @BeforeEach
    void setUp(){
        //create test orders
        order1 = new Order(1L, "TestCustomer1", "19-20-30", Status.CANCELLED, "I bought too much TP!", "5-30-20" );
        order2 = new Order(2L, "TestCustomer2", "12-10-30", Status.PENDING, "I'm ready for my tuna cans!", "5-6-20" );
//        orderDao.save(order1);
//        orderDao.save(order2);
        assertNotNull(order1.getId());
        assertNotNull(order2.getId());
    }

    @Test
    void createOrderWithId() {
        Order order = orderService.createOrder(order1);
        assertNotNull(order1.getId());
        System.out.println(order1);
    }
}