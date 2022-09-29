package com.afrarods.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afrarods.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
