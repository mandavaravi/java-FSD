import java.util.*;
@FunctionalInterface
interface inter2 {
	public String display(String name);
}
@FunctionalInterface
interface inter3 {
	public int add(int a, int b);
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String nane;
			inter2 a1 = (name)->{
				return "hi " + name;
			};
			System.out.println(a1.display("Mr.R"));
	
		Scanner sc = new Scanner(System.in);
		//defining the function here
		inter3 a3 = (a,b)->(a+b); // or (a,b)-> {return a+b;};
		System.out.println(a3.add(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

}
