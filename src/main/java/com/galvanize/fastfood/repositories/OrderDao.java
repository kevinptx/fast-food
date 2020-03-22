package com.galvanize.fastfood.repositories;

import com.galvanize.fastfood.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository <Order, Long> {
}
