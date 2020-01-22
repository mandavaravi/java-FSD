/// over riding
class A {
	void disp(){
		System.out.println("A");
	}
	void disp2(){
		System.out.println("A2");
	}

}



class B extends A{
	void disp(){
		super.disp();  //displays the base class func
		System.out.println("B"); // o/p over ridden func
	}
	void disp1(){
		System.out.println("B1");
	}
	
}

public class Main{
	
	public static void main(String []args) {
		//A a = new A();
		A b = new B();  // obj is for A ,  instance is for B
		//a.disp();
		b.disp();
		// b.disp1();  // err cuz disp1 is not an override func , b is an object of class A
		b.disp2();
		
	}
}