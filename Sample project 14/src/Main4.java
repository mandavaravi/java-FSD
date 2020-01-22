//import java.util.*;


// threads and lambda expressions

public class Main4 {

	
	public static void main(String[] args) {
		Runnable rn = new Runnable() {
			public void run() {
				System.out.println(this + " running");
			}
		};
		
		Thread t = new Thread(rn);
		t.start();
		
		Runnable rn1 =  ()->{
			System.out.println(" Thread 2 running ");
		};
		Thread t1 = new Thread(rn1);
		t1.start();
		
	}

}
