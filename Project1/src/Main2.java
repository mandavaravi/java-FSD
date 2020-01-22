class C{
	
	C(){
		System.out.println("No Arg C");
	}
	C(int a){
		System.out.println("Para C");
	}
}

class D extends C{
	D(int a){
		super();
		//super(a);
		System.out.println("In D");
	}
}
public class Main2 {
	public static void main(String agrs[]) {
		D d1 = new D(2);
	}
}
