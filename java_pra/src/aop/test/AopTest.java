package aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.example.MyMethod;

public class AopTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/applicationContext.xml");
		MyMethod myMethod = (MyMethod) applicationContext.getBean("myMethod");
		myMethod.show();
	}
}
