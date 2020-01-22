import java.io.*;

/// File: built in methods
public class Main4 {

	public static void main(String[] args) {
		try {
			File f = new File("d.txt");
			if(f.createNewFile()) {
				System.out.println("new file created");
			}
			else {
				System.out.println("File exists already");
			}
		}
		catch(Exception e) {
			
		}

	}

}
