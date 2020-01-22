package pack;

import org.springframework.beans.factory.*;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;

public class Main {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("AppCon.xml"));
		Student student= (Student)bf.getBean("studentbean");
		student.displayInfo();  
	}

}
