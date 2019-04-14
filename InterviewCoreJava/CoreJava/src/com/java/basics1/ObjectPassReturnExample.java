package com.java.basics1;
class User
{
	int rollno;
	String name;
	String address;
	String phone;
	String status;
}
class Order
{
	int orderId;
	String orderName;
	
}
class UI
{
void takeData(User user){
	DB db = new DB();
	db.checkData(user);
	System.out.println("User Status is "+user.status);
}
}

class DB
{
	Order checkData(User user){
		Order order = new Order();
		System.out.println("DB Logic...."+user.name);
		user.status="Login";
		if(user.name.equals("Ram")){
			
			order.orderId=1001;
			order.orderName="Pizza";
		}
		else{
			
			order.orderId=1002;
			order.orderName="Burger";
		}
		return order;
		
	}
}

public class ObjectPassReturnExample {

	public static void main(String[] args) {
		User user = new User();
		user.name="Ram";
		user.address="Roop Nagar";
		user.phone="2222";
		user.rollno = 1001;
		UI obj = new UI();
		obj.takeData(user);

	}

}
