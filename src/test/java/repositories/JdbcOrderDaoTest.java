//package repositories;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.transaction.Transactional;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class JdbcOrderDaoTest {
//    @Mock
//    JdbcTemplate jdbcTemplate;
//    JdbcOrderDao jdbcOrder;
//
//    @BeforeEach
//    public void setup() {
//        //Setup
//        jdbcOrder = new JdbcOrderDao(jdbcTemplate);
//    }
//
//
//    @Test
//    void GetAllOrders() {
//
//        //Setup
//        System.out.println("print");
//        //Exercise
//
//        //Assert
//    }
//}