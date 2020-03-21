package repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
class JdbcOrderDaoTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void GetAllOrders() {

        //Setup
        JdbcOrderDao jdbcOrder = new JdbcOrderDao(jdbcTemplate);
        //Exercise

        //Assert
    }
}