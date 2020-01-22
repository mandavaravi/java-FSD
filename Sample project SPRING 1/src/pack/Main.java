package pack;

import org.springframework.beans.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;  
import org.springframework.context.support.*;
import org.springframework.core.io.ClassPathResource;  


public class Main {  
	
	public static void main(String[] args) {  
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("AppCon.xml");
	    A a1 = (A) context.getBean("Abean");
	      
	      //BeanFactory bf = new XmlBeanFactory(new ClassPathResource("AppCon.xml"));
		  // A a1 = bf.getBean("Abean", A.class);
	    a1.display();
	  */
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("AppCon.xml"));
		A a2 = bf.getBean("Abean", A.class);
	    a2.setMessage("47 is here");
	    a2.getMessage();
	    
	    A b1 = bf.getBean("Abean", A.class);
	    //b1.setMessage("007 is here");
	    b1.getMessage();
	    
	}
}