//// java IO

/*/ 	 input stream class {			|		output stream class{
			 * file input				|			* file
			 * buffered					|			* byte array
			 * byte array				|			* buffered
			 * data input				|			* data
			 * java filter				|			* java filter
			 * piped input				|			* piped
			 * object input				|			* object 
			 * push back				|			* print stream
			 * }						|			}
			 * */
			
			
			 
			 
			/* reader class				|		Writer class
			 * file reader				|			* print
			 * buffered					|			* file
			 * char array				|			* buffered
			 * pushback					|			* char array
			 * inputstream reader		|			 * output stream writer
			 * string reader			|			 * string
			 * piped reader				|			 * piped
			 * filter reader			|			 * piped
			  */
			
			


import java.io.*;


public class Main {

	public static void main(String[] args)  {
		try {
			/*
			File f = new File("a.txt");
			FileInputStream fist = new FileInputStream(f);
			int i;
			while((i = fist.read())!= -1) {
				System.out.print((char)i);
			}
			
			File f1 = new File("b.txt");
			FileOutputStream fost = new FileOutputStream(f1);
			String a = "Adios";
			byte b[] = a.getBytes();
			fost.write(b);
			*/
			
			/*
			File f = new File("C://Users//Dell//eclipse-workspace//Sample project 8//src//Main.java");
			FileInputStream fist = new FileInputStream(f);
			BufferedInputStream bist = new BufferedInputStream(fist);
			int i;
			while((i = bist.read()) != -1 ) {
				System.out.print((char)i);
			}*/
			
			/*  //not working
			String aa = "Say";
			File f = new File("c.txt");
			FileOutputStream fost = new FileOutputStream(f);
			byte bb[] = aa.getBytes();
			System.out.println((char)bb[2]);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fost);
			bufferedOutputStream.write(bb);
			bufferedOutputStream.close();
			*/

			DataOutputStream dout = new DataOutputStream(new FileOutputStream("b.txt"));
			dout.writeDouble(1.2);
			dout.writeInt(23);
			dout.writeBoolean(true);
			dout.writeChar('a');
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Cant open file");
			return;
		}
		
		try {   /// try block is  for DataOutputStream
			File f = new File("b.txt");
			FileInputStream fist = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fist);
			double a = dis.readDouble();
			int b=  dis.readInt();
			boolean c = dis.readBoolean();
			char d= dis.readChar();
			System.out.println(a +" "+b +" "+c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
