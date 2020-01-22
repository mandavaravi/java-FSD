public class Main6 implements inter1{
	public static void main(String args[]) {
		inter1 i = new inter1()  // inter1 is an interfase
			{ //anonymus inner class
			public int disp() {
				System.out.print("func returns: ");
				return 2;
			}
			}; // anonymus class till here
		System.out.println(i.disp());
		
		
		inter2 i2 = new inter2() //inter2 is a abstract class
		{ //anonymus inner class
		public int disp() {
			System.out.print("func2 returns: ");
			return 22;
		}
		}; // anonymus class till here
	System.out.println(i2.disp());
	}

	

	
}
