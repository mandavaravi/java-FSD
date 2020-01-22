package pack;

public class Main5 {

	public static void main(String[] args) {
		/*
		try {
			func1();
			System.out.println("a");
		}
		catch(RuntimeException r) {
			System.out.println("b " + r);
		}
		catch(Exception e) {
			System.out.println("c");
		}
		finally {
			System.out.println("d");
		}
		System.out.println("e");
		*/
		
		try {
			return;
		}
		finally {
			System.out.println("finally");
		}
	}
	/*
	public static void func1() {
		//System.out.println();
		throw new RuntimeException();
		
	}*/
	
}
