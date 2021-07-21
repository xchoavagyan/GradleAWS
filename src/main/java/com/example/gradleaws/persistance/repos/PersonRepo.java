package com.example.gradleaws.persistance.repos;

import com.example.gradleaws.persistance.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PersonRepo extends JpaRepository<Person,Long> {
    Person findByName(String name);
    ArrayList<Person> findAllByAge(Integer age);
}
