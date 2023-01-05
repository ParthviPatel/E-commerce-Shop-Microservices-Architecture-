package com.parthviprogramming.repository;

import com.parthviprogramming.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
