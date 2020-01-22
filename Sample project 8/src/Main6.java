import java.io.*;
public class Main6 {

	public static void main(String[] args) {
		try {
			File f = new File("C://Users//Dell//eclipse-workspace//Sample project 8/src");
			File f1[] = f.listFiles();
			for(File fi:f1) {
				System.out.println(fi.getName()  +  " :\t " + fi.getAbsolutePath() + "  " +  fi.canRead() + " " + fi.canWrite() + " " + fi.isHidden() +  " " + fi.length() +" bytes" );
			}
		}
		catch(Exception e) {
			
		}

	}

}
