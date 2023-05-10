package com.springboot.project.car.SpringBootProjectCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.project.car.SpringBootProjectCar.model.CarMgmt;

@Repository
public interface CarMgmtRepository extends JpaRepository<CarMgmt,Long> {

}
