
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.start();
	}
	
	void start() {
		long a1[] = {3,4,5};
		System.out.println(a1[0]+ a1[1] + a1[2] + " s");
		long a2[] = fix(a1); //func calls an arr by reference defaultly
		System.out.println(a1[0]+ a1[1] + a1[2] + " s");
		System.out.println(a2[0]+ a2[1] + a2[2]);
	}
	
	long[] fix(long a3[]) {
		a3[1] = 7;
		return a3;
	}

}
