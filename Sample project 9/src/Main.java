import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student stu = new Student(101, "Tony");
			FileOutputStream fos = new FileOutputStream("a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.flush();
			oos.close();
			System.out.println("Return success");
		}
		catch(Exception e) {
			e.getMessage();
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
			Student s = (Student)(ois.readObject());
			System.out.println(s.getId() + " ; " + s.getName());
			ois.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
