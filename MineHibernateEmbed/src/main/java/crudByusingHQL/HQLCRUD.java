package crudByusingHQL;

import java.util.Iterator;
import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HQLCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
	
		
		Session session = sessionFactory.openSession();
		
		//for whole data
		Query<Employee> query = session.createQuery("from Employee");

		List<Employee> list = query.list();
		
		for(Employee emp : list){
		emp.getAddress();
		emp.getClass();
		emp.getName();
		System.out.println(emp);
			
		}
		//for particular data 
		Query<Employee> query1 = session.createQuery("from Employee WHERE id =:id");
        query1.setInteger("id", 1);
        Employee emp = (Employee)query1.uniqueResult();
        System.out.println(emp);
		
		
		System.out.println("EMPLOYE : "+query);
		
		// for pagination i.e for limit 
		//HQL pagination example
				
		
		       Query query3 = session.createQuery("from Employee");
				query3.setFirstResult(0); //starts with 0
				query3.setFetchSize(2);
				List<Employee> empList = (List<Employee>)query3.list();
				for(Employee emp4 : empList){
					System.out.println("Paginated Employees::"+emp4.getId()+""+emp4.getName());
				}
		
		
		
		
		
		
	}

}
