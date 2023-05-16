package com.springbootproject.SpringBootProjectPepole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.SpringBootProjectPepole.model.People;
import com.springbootproject.SpringBootProjectPepole.repository.PeopleRepository;

@RestController
@RequestMapping("/data")
public class PeopleController {
	@Autowired
	
	PeopleRepository pr;
	
	@PostMapping("/save")
	public void savePeople(@RequestBody People po) {
		pr.save(po);
	}
	@RequestMapping("/show")
	public List<People> getPeople() {
		return pr.findAll();	
	}
	@RequestMapping("/show/{id}")
	public People getById(@PathVariable("id")Long id) {
		return pr.findById(id).get();		
	}
	@RequestMapping("update/{id}/{name}")
	public void updatePeople(@PathVariable("id")Long id,@PathVariable("name")String name) {
		People peo = pr.findById(id).get();
		peo.setName(name);
		pr.save(peo);
	}
	@RequestMapping("/delete/{id}")
	public void deletePeople(@PathVariable("id")Long id) {
		pr.deleteById(id);
	}

}
