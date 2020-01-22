import java.io.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C://Users//Dell//eclipse-workspace//Sample project 8//src//Main1.java");
			FileWriter fw = new FileWriter("a.txt");
			int i;
			while((i = fr.read()) != -1) {
				//System.out.print((char)i);
				fw.write((char)i);
			}
			fw.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
