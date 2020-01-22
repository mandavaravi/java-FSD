package pack;

import java.util.*;

public class Student {
	
	private String sname;
	private String sid;  
	
	//private Address a;
	private List<String> Mobile;
	
	public Student( String sid, String sname, List<String> mobile) {
		this.sid = sid;
		this.sname = sname;
		Mobile = mobile;
	}

	/*public Student( int sid,String sname, Address a) {
		this.sid = sid;
		this.sname = sname;
		//this.a = a;
		
	}*/
	
	public void displayInfo(){  
	    System.out.println("Name: "+ this.sname +"\nSID: "+ this.sid );  
	    Iterator i = Mobile.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}
	
	
	

}  
