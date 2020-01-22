
public class Employee {
	int id;
	String name;
	int salary;
	/* Main5
	 * 
	 * public Employee(int id, String name){
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id= " + id + ", name= " + name + "]";
	}
	*/
	
	//Main6
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
