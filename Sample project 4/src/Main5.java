
public class Main5 {
	
	Main5(){
		System.out.println("In construct Main5");
	}
	static {
		System.out.println("In static Main5");
	}
	{ // instance block - has no name
		//instance block gets compiled only when obj is created
		System.out.println("In instance block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main5 m = new Main5();
	}

}
