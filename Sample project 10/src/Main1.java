
public class Main1 extends Thread{
	
	Main1(String s){
		this.setName(s);
	}
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 m = new Main1("C1");
		Main1 m1 = new Main1("C2");
		m.setPriority(Thread.MIN_PRIORITY);
		m1.setPriority(Thread.MAX_PRIORITY);
		m.start();
		m1.start();
		
	}

}
