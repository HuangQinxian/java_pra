package aop.example;

import org.springframework.stereotype.Component;

@Component
public class MyMethod {
	public void show() {
		System.out.println("开始执行");
	}
}
