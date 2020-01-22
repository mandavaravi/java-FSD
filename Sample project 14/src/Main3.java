import java.util.*;

interface inter4{
	String say(String msg);
}

public class Main3 {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(7);
		l.add(3);
		l.add(2);
		l.forEach ( (n) -> System.out.println(n) ) ;
		inter4 i4=(msg)->{
			String s1= "Well hello there.. ";
			String s2 = s1+msg;
			return s2;			
		};
		System.out.println(i4.say("Mr. R"));
		
	}

}
