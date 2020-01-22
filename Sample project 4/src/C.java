
public class C implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		B b = new C();
		C c = new C();
		a.dispA();   //a.dispC, a.dispB     gives err
		b.dispB();
		c.dispA();
		c.dispB();
		c.dispC();
	}

	@Override
	public void dispB() {
		// TODO Auto-generated method stub
		System.out.println("Interface B" + a);
		// 'a' is a static var so accessable without obj
	}

	@Override
	public void dispA() {
		// TODO Auto-generated method stub
		System.out.println("Interface A");
	}
	
	public void dispC() {
		// TODO Auto-generated method stub
		System.out.println("Interface C");
	}

}
