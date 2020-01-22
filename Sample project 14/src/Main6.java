import java.util.*;
import java.util.stream.Collectors;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(1,"A",15));
		l1.add(new Employee(2,"B",12));
		l1.add(new Employee(3,"C",11));
		l1.add(new Employee(4,"d",18));
		l1.add(new Employee(5,"e",10));
		l1.add(new Employee(6,"f",19));
		
		List <Integer>l2 = l1.stream().					  // Stream API is used to process collections of objects
							filter(p->p.salary>13).       // filters rows with sal>13
							map(p->p.salary).             //takes only the salary col from Employee list
							collect(Collectors.toList()); //stores the collected data and converts to list
		
		System.out.println(l2);
		
		
		
	}

}
