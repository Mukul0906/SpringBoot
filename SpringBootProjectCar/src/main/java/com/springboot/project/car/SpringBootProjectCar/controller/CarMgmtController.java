package com.springboot.project.car.SpringBootProjectCar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.project.car.SpringBootProjectCar.model.CarMgmt;
import com.springboot.project.car.SpringBootProjectCar.repository.CarMgmtRepository;

@RestController
@RequestMapping("/car")
public class CarMgmtController {
	@Autowired
	CarMgmtRepository cmr;
	@PostMapping("/save")
	public void saveCar(@RequestBody CarMgmt cm) {
		cmr.save(cm);
	}
	@RequestMapping("/details")
	public List<CarMgmt> getCar() {
	return cmr.findAll();
	}
	@RequestMapping("/update/{id}/{bookName}")
	public void updateCar(@PathVariable("id")Long id,@PathVariable("model")String cname) {
	CarMgmt cmt = cmr.findById(id).get();
	cmt.setModel(cname);
	cmr.save(cmt);
	}
	@RequestMapping("/details/{id}")
	public CarMgmt getById(@PathVariable("id")Long id) {
	return cmr.findById(id).get();
	}
	@RequestMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id")Long id) {
	cmr.deleteById(id);
	}

}
