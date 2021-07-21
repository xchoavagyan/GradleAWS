package com.example.gradleaws.persistance.repos;

import com.example.gradleaws.persistance.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProductRepo extends JpaRepository<Product,Long> {
    ArrayList<Product> findAllByProductName(String productName);
}
