package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Department {

	@Id
	private int dept_id;
	@Column
	private String name ;
    
	
	
	
}
