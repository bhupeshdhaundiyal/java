package com.java.ImmutableConcept;

public class CreareImmutableClass {

	//fields are private and final 
	//no setters 
	//class must be final
	
	
	private final int id ;
	private final String name;
	
	public CreareImmutableClass(int id, String name){
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CreareImmutableClass [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		CreareImmutableClass objRahul = new CreareImmutableClass(101,"Rahul");
	//	objRahul.name="Change Rahul";   //cannot changed
		
		System.out.println(objRahul);
		
		

	}

}
