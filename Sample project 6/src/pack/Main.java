package pack;  //user defined package
//import java.util.*; // scanner input
//import java.io.*;   // bufferedreader input




public class Main {
	// exception handling:  try, catch, finally, throw, throws
	public static void main(String[] args){
		// TODO Auto-generated method stubk
		 
		int a,b,c;
		
		//Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		
        try  // inside try block is called guarded
        { 
        	a = Integer.parseInt(args[0]);  // Integer.parseInt(String a):  string --> integer
        	b = Integer.parseInt(args[1]);  // readline takes string input
        	c = a/b;
                  
            // this statement will never execute 
            // as exception is raised by above statement 
            System.out.println("Inside try block" + c); 
        }  
        catch (NumberFormatException e) // wrong data input exception
        {
            System.out.println(e.getMessage());
        }
        
        catch(ArithmeticException e)   // e.getMessage() gives the error message
        { 
            System.out.println("ArithmeticException has been caught: " + e.getMessage()); 
        }
        catch(Exception g)   // 'Exception <varname>'  can handle all the exceptions. it is generic exception handler
        { 
            System.out.println("Exception has been caught: "+ g); 
        }
        finally {
        	System.out.println("finally executed");
        }
          
        // rest program will not execute 
        System.out.println("Outside try-catch clause"); 
	}

}
