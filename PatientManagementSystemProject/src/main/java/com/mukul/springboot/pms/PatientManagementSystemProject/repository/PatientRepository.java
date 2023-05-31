package com.mukul.springboot.pms.PatientManagementSystemProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukul.springboot.pms.PatientManagementSystemProject.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
