package com.springbootproject.SpringBootProjectPepole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.SpringBootProjectPepole.model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People,Long>{

}
