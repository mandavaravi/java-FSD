import java.util.*;

//collectins and lambda

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1,"A", 0));
		l.add(new Employee(2,"B", 0));
		l.add(new Employee(3,"C", 0));
		Collections.sort( l, (p1,p2) -> { return p1.name.compareTo(p2.name); } );
		for(Employee e: l) {
			System.out.println(e.toString());
		}
	}

}
