import java.lang.*;

public class Main extends Thread{
	
	Main(String s){
		this.setName(s);
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(545);   // 1188 ms is the break point
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 ways to create threads - extending thread class or implements runnable
		// class object will be a thread obj if we use 'extends thread'
		// have to create a separate thread obj if used 'extends runnable'
		
		/*Thread t = new Thread();  //creating new thread obj
		t.start();
		*/
		//calling start --> it will be runnable
		// runnable--> running , can't predict
		//it'll call run() method implicitly when in runnable state
		//in running state, if we call sleep() or wait() --> bloacked state
		// for blocked-->running to happen, we should call notify() or sleep time should be over
		
		Main m = new Main("Child 1");  //Class Main obj is a thread obj 
		// have to use 'extends Thread' at Main class
		//Thread t = new Thread(m); // have to pass Main obj 'm' to call the user defined 'run' method
		// or it'll call the inbuilt run method in thread class
		m.start();
		Main m1 = new Main("Child 2");
		Main m2 = new Main("Child 3");
		try {
			m.join();  //uses the whole resources to until finished
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m1.start();
		m2.start();
	}

}
