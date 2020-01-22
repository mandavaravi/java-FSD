import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();  //generics 
		al.add(new Employee(105, "john"));
		al.add(new Employee(102, "Nick"));
		al.add(new Employee(103, "Tony"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
