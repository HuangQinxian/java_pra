package aop.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Huangqx
 *  通过@Aspect声明一个切面类，然后注入到spring容器中
 */
@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* aop.example.*.*(..))")
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
	public void beforeMethod() {
		System.out.println("准备执行");
	}
	
	@After("myPointCut()")
	public void afterMethod() {
		System.out.println("执行完毕");
	}
}
