import java.io.*;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C://Users//Dell//eclipse-workspace//Sample project 8//src");
			String s[] = f.list();
			for(String i:s) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			
		}
	}

}
