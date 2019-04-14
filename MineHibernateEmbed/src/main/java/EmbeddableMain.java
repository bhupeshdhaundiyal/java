import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbeddableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory  sesionfactory = new Configuration().configure().buildSessionFactory();
		
		Employee emp = new Employee();
		emp.setId(1);
		Address address = new Address();
		address.setCity("TEST CITY");
		address.setZipcode("TEST ZIPCODE");
		emp.setAddress(address);
		
		Session session = sesionfactory.openSession();
		Transaction tran = session.beginTransaction();
		
		session.saveOrUpdate(emp);
		tran.commit();
		session.close();
		
		System.out.println("EMBED COMPLETED");
		
		
		
	}

}
