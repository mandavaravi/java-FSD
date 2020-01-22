package pack;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AppCon.xml");
	    studentDao st = (studentDao) context.getBean("s");
	    
	    //int count = st.saveStudent(new student("Jhonny English",1));
		//System.out.println(count + "rows updated");
		
	    //int count = st.updateStudent(new student("Jason Bourne ", 47));
	     //System.out.println(count + "rows updated");
	    
	    //int count = st.deleteStudent(new student(1));
	    //System.out.println(count + "rows updated");
	    
	    List<student> list = st.getAllStudent();
	    
	    for(student e:list)  
	        System.out.println(e.sid +"\t" + e.sname);  
	          
	    }  
	}
