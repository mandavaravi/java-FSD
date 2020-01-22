package pack;

public class Main3 {

	public static void main(String[] args) {
		try {
			throw new NullPointerException();   //o/p null pointer exception
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
