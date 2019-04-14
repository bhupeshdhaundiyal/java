package com.java.ImmutableConcept;
//why immutable class is final 
//final class ImmutableClass{
class ImmutableClass{

	private final int value ;
	
	public ImmutableClass(int value) {
	this.value=value;
		
	}
	@Override
	public String toString() {
		return "ImmutableClass [value=" + value + "]";
	}
	public int getValue() {
		return value;
	}
}

public class MutableClass extends ImmutableClass{
	
private int realValue ;

@Override
public String toString() {
	return "MutableClass [realValue=" + realValue + "]";
}

public MutableClass(int value) {
	// TODO Auto-generated constructor stub
	super(value);
	this.realValue=value;
}

	public static void main(String[] args) {
		MutableClass obj = new MutableClass(4);
		ImmutableClass immObj = (ImmutableClass) obj;

		System.out.println(obj);
        obj.realValue=5;
        System.out.println(immObj);
		
	}
}


/*Imagine you have a function that takes an Immutable an argument. 
 * I can pass a Mutable object to that function, since Mutable extends Immutable. 
 * Inside that function, while you think your object is immutable, 
 * I could have a secondary thread that goes and changes the value as the function runs. 
 * I could also give you a Mutable object that the function stores, 
 * then later change its value externally. In other words, if your function assumes the value is immutable,
 *  it could easily break, since I could give you a mutable object and change it later on.
 *   Does that make sense?

The method that you pass the Mutable object into won't change the object. 
The concern is that that method might assume that the object is immutable when it really isn't.
 For example, the method might assume that, since it thinks the object is immutable, 
 it can be used as the key in a HashMap. I could then break that function by passing in a Mutable,
  waiting for it to store the object as a key, then changing the Mutable object.
   Now, lookups in that HashMap will fail, because I changed the key associated with the object. 
   Does that make sense?
*/