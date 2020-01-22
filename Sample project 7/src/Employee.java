
public class Employee implements Comparable<Employee> {
	///POJO class///
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Employee e) { //have to implement comparable interface to use this
		if(this.id < e.id) {
			return -1;
		}
		else if(this.id > e.id) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
