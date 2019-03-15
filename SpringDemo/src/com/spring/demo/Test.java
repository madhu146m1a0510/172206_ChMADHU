package com.spring.demo;


import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Resource resource=new ClassPathResource("Resource.xml");  
		   // BeanFactory factory=new XmlBeanFactory(resource);  
	      ApplicationContext factory=(ApplicationContext) new XmlBeanFactory(resource);
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();  
	}

}
