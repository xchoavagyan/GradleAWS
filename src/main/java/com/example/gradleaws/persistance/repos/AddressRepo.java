package com.example.gradleaws.persistance.repos;

import com.example.gradleaws.persistance.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
