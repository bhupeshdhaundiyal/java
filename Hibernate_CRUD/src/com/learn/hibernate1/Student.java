package com.learn.hibernate1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE_UPDATED")
public class Student {

@Id
@Column(name="PRIMARY_KEY")
private int id;

@Column(name="NAME",nullable=false,precision=3)
private String name;

@Column(name= "DETAILS" , nullable=false,precision=10,scale=25)
private String Details;

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
public String getDetails() {
	return Details;
}
public void setDetails(String details) {
	Details = details;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Details=" + Details
			+ "]";
}
}
