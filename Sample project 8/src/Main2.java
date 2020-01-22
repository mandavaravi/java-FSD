import java.io.*;

//printstream
public class Main2 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("c.txt");
			PrintStream ps = new PrintStream(fos);
			ps.println(2020);
			ps.println("Hello java");
			ps.println(" world");
			ps.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
