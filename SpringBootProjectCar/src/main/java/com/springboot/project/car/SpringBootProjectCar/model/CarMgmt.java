package com.springboot.project.car.SpringBootProjectCar.model;

import javax.persistence.*;

@Entity
@Table(name="Car_Details")

public class CarMgmt {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Car_id")
	private int id;
	@Column(name="Car_Company")
	private String cmpny;
	@Column(name="Car_Model")
	private String Model;
	@Column(name="Car_Registration_No.")
	private Long regno;
	
	// generating getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCmpny() {
		return cmpny;
	}
	public void setCmpny(String cmpny) {
		this.cmpny = cmpny;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Long getRegno() {
		return regno;
	}
	public void setRegno(Long regno) {
		this.regno = regno;
	}
	// parameterized constructor
	public CarMgmt(String cmpny, String model, Long regno) {
		super();
		this.cmpny = cmpny;
		Model = model;
		this.regno = regno;
	}
	
	public CarMgmt() {
		
	}
	
	
}
