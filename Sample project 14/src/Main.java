// lambda expression example

@FunctionalInterface
interface inter1 {
	public void disp();
}

public class Main {

	public static void main(String[] args) {
		// a func with only one abstract method is functional intreface
		int width =10;
		// def for an interface
		inter1 a1 = ()-> {
			System.out.println(width*4);
		};
		a1.disp();

	}

}
