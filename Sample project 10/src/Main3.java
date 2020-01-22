class Customer{
	int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("With draw");
		if(this.amount>=amount) {
			this.amount = this.amount - amount;
			System.out.println("Withdraw Transaction successful");
		}
		else {
			System.out.println("low balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Deposit");
		this.amount += amount;
		System.out.println("Deposit successful; Bal: " + this.amount);
		notify();
	}
	
}

public class Main3 {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();
		
		
	}

}
