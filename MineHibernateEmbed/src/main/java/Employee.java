import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
	@Id
	private int id ;
	@Column
	private String name;
	public int getId() {
		return id;
	}
	@Embedded
	Address address;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(int id ,String name) {
        this.id=id;
		this.name=name;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}
