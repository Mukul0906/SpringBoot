package com.mukul.springboot.pms.PatientManagementSystemProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mukul.springboot.pms.PatientManagementSystemProject.model.Patient;
import com.mukul.springboot.pms.PatientManagementSystemProject.repository.PatientRepository;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientRepository pr;
	@GetMapping("/all")
	public List<Patient> getpatients(){
		return pr.findAll();
	}
	@PostMapping("/save")
	public ResponseEntity savePatient(@RequestBody Patient pt) {
		pr.save(pt);
		return new ResponseEntity(HttpStatus.OK);		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity updatePatient(@PathVariable("id")Long id,@RequestBody Patient pt) {
		Patient p1 = pr.findById(id).get();
		p1.setFname(pt.getFname());
		p1.setLname(pt.getLname());
		p1.setAddr(pt.getAddr());
		pr.save(p1);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deletePatient(@PathVariable("id")Long id) {
		pr.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
}
