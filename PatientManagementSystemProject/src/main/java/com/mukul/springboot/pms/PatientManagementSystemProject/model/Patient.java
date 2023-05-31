package com.mukul.springboot.pms.PatientManagementSystemProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient_details") // to assign table name

public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // for auto generation
	@Column(name="Patient_ID") // for coulumn name
	int id;
	@Column(name="First_Name")
	String fname;
	@Column(name="Last_Name" )
	String lname;
	@Column(name="Address")
	String addr;
	@Column(name="Contact_no.")
	long mob;
	@Column(name="EMail_Id")
	String mail;
	// getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	// Parameterized Contructor
	public Patient(String fname, String lname, String addr, long mob, String mail) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
		this.mob = mob;
		this.mail = mail;
	}
	// default constructor
		public Patient() {
			
		}
}