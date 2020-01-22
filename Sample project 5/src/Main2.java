class Student{
	Student(String S){
		
	}
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 String s = new String("hi there");
		String s1 = new String("hi ");
		System.out.println(s1 + "\n"+ s); 
		s1.concat("there!"); //stores somewhere in heap not in s1, since string obj are immutable
		s1 = s1.concat("there"); 
		// string buffer or string builder are mutable
		System.out.println(s1);
		 * */
		
		/*
		StringBuffer s = new StringBuffer("Hello");
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(s);
		System.out.println(sb);
		s.append(" world");
		sb.append(" world");
		System.out.println(s);
		System.out.println(sb);
		*/
		
		/*
		String s1 = new String("hi");
		String s2 = new String("hi");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.compareTo(s2));
		
		String s3 = "hi";
		String s4 = "hi";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		System.out.println(s3.compareTo(s4));
		*/
		/*
		String s5 = new String("hello");
		Student Stu = new Student("hello");
		System.out.println(s5.equals(Stu));
		*/
		/*
		String s6 = new String("hello");
		String s7 = "hello";
		System.out.println(s6.equals(s7));
		System.out.println(s6 == s7);
		System.out.println(s6.compareTo(s7));
		*/
		/*
		String s8 = new String("hello");
		String s9 = new String("HELLO");
		System.out.println(s8.charAt(2) +"\n"+ s9.endsWith("lo"));
		System.out.println(s8.equals(s9) +"\n"+ s9.equalsIgnoreCase(s8));
		System.out.println(s8.substring(2)+"\n"+ s9.endsWith("LO"));
		System.out.println(s9.toLowerCase()+"\n"+ s8.toUpperCase());
		*/
		String s10 = new String("Say my name. Yeah, Thats right!");
		String s11[] = s10.split(",");  // "\\s" or " " --> [space]
		for(String s12:s11) {
			System.out.println(s12);
		}
		
	}

}
