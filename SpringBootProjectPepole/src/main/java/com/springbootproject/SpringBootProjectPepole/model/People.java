package com.springbootproject.SpringBootProjectPepole.model;

import jakarta.persistence.*;

@Entity
@Table(name="People_Details")
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Serial")
	private int id;
	private String name;
	private String address;
	// getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public People(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public People() {
		
	}
	
	

}
