// assertions example
// run in cmd using javac Main.java --> java -ea Main
// -ea means enable assertions

import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		assert a>5 :"Error";
		System.out.println(a);

	}

}
