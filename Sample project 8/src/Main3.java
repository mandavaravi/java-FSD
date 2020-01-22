import java.io.*;

/// print writer
public class Main3 {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter(System.out);
			pw.write("Deja vu");
			pw.flush();			
			pw.close();
			PrintWriter pw1 = null;
			pw1 = new PrintWriter(new File("a.txt"));
			pw1.write("si senor");
			pw1.flush();
			pw1.close();
		}
		catch(Exception e) {
			
		}
	}

}
