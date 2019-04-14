package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_one")
public class Employee {
    
	@Id
	private int id;
	@Column
	private String name ;
	
	@OneToOne
	Department dept;
	
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	
}
