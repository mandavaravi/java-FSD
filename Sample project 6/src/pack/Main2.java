package pack;


class MyException extends Exception{
	int a,b;  //instance variables
	MyException(int a, int b){
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return("Error: value should not be >20 \nBut the sum= " + (this.a + this.b));
	}
}

public class Main2 {
	public static void caluculate(int a, int b) throws Exception{
		int sum = a+b;
		if(sum>20) {
			throw new MyException(a,b); //MyException instance is created... so, it calls the constructer
		}
		System.out.println("result sum: " + sum);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		try {
			//caluculate(3,4);
			//System.out.println("Try start");
			caluculate(13,15);
		}
		catch(MyException e) {
			System.out.println(e);  // e has an method named toString
		}

	}

}
