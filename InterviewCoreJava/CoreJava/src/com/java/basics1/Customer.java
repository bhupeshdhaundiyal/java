package com.java.basics1;

// Functionality
// Class is a category , 
// Class is a collection of similar object

// OOAD  (SRP)
public class Customer {
// Features
	// Characters
	private int id;  // Instance Var
	private String name;
	private String address;
	private String companyName;
	private String email;
	private String phone;
	private String state;
	private String city;
	
	/*
	 * Constructor- Instance Var Values Initalize
	 * Cons Name is same as class name
	 * And it is call automatically
	 */
	
	Customer(){
		companyName = "FlipKart";
		
	}
	// Primary
	Customer(int id , String name , String address){
		// First Line
		this();
		// Same class default cons
		this.id = id + companyName.length();  // Instance Var = local var
		this.name = name;
		this.address = address;
		
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	
	public void calculateDiscount(){
		
	}
	public void showHistory(){
		
	}

	// ram.takeInput(1001,"Ram","Delhi");  // this
	/*public void takeInput(int id, String name, String address){
		if(id>0){
		// ram.id
		this.id = id;
		this.name = name;
		this.address =address ;
		}
		else
		{
			System.out.println("Invalid Id");
		}
	}
	public void print(){
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+name);
		System.out.println("Address is "+address);
	}*/
/*	{
		System.out.println("I Will Call Before Cons "+id + " "+name+" "+address);
	}
	Customer(){
		System.out.println("Customer default Cons");
	}*/
	/*Customer(){
		
	}*/
	
	
}
