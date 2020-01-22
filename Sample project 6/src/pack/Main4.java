package pack;
//wrapper class
public class Main4 {

	public static void main(String[] args) {
		int a =12;
		System.out.println("a " + a);
		Integer b = 23;  // auto boxing,     priitive data type -->  object 
		// same working as ""Integer i =  Integer.valueOf(a);""
		System.out.println("b " + b);
		Integer i =  Integer.valueOf(a); // Boxing,
		System.out.println("i " + i);
		Integer c = new Integer(3);
		int j = c.intValue();  // unboxing,   object --> priitive data type
		System.out.println("j " + j);
		int k = c;  // auto unboxing,   object --> priitive data type
		System.out.println("k " + k);



	}

}
