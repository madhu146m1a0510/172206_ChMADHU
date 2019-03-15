package com.madhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); 
        Shape sh=context.getBean("sh",Shape.class);
        System.out.println(sh.getCircle().getName());

    }
}
