package repositories;

import entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository <Order, Long> {
    String query = "Select from Orders where order.id = ?";
}
