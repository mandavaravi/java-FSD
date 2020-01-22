import java.text.*;
import java.text.ParseException;
import java.util.*;

public class Main4 {

	public static void main(String[] args) throws ParseException {
		/*
		try {
		 
			while(true){
				Date d = new Date();
				//System.out.println(d);
				String s = d.toString();
				Thread.sleep(1000);
				System.out.println(s.substring(11, 19));
				
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		*/
		/*
		long m = System.currentTimeMillis();
		Date d = new Date(m);
		System.out.println(d);
		*/
		/*// sql package required
		String s = "2019-12-03";
		Date d1 = Date.valueOf(s);
		System.out.println(d1);
		*/
		/*
		Calendar cal = Calendar.getInstance();
		System.out.println("curr time:  "+cal.getTime());
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days ago:  "+cal.getTime());
		cal.add(Calendar.MONTH, 4);
		System.out.println("4months later:  "+cal.getTime());
		cal.add(Calendar.YEAR, 2);
		System.out.println("2 years later:  "+cal.getTime());
		*/
		
		Date d = new Date();
		System.out.println(d);
		String s = DateFormat.getDateTimeInstance().format(d);
		System.out.println(s);
		Date s1 = DateFormat.getDateInstance().parse("01 March,2020");
		System.out.println(s1);
		
	}

}
