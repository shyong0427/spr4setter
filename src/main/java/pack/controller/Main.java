package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter_init.xml");
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		
		System.out.println(myProcess);
	}
}