package com.example.gradleaws.persistance.repos;

import com.example.gradleaws.persistance.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
