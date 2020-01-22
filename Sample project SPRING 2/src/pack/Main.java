package pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    BeanClass1 a1 = (BeanClass1) context.getBean("Bb");
		a1.getMessage();
		context.registerShutdownHook();
		
	}

}
