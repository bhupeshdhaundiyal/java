package com.spring.basics.SpringAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdfc.Services.AccountService;

@Component("Employee")
public class Employee {
private int id;
private String name;
@Autowired
AccountService accountService;

//private Address address;
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
/*public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
*/@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" //+ address
			+ "]";
}
}