package com.myproject.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
    private String rollNo;
	private String emailId;
	
	public Students() {
		super();
	}
	public Students(int id, String name, String rollNo, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.emailId = emailId;
	}
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
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", emailId=" + emailId + "]";
	}
	
	
	
	
	

	

}
