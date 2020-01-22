import java.util.StringTokenizer;

public class Say {
	public String say() {
		return "Hi there";
	}
	
	
	public static String stringReverse(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(str, " ");
		
		while(stk.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(stk.nextToken());
			sb.reverse();
			result.append(sb);
			result.append(" ");
			}
		
		String res = result.toString().substring(0, result.toString().length()-1); 
		return res;
	}
	/*
	public static void main(String a[]) {
		System.out.println(stringReverse("hi there"));
	}*/
}
