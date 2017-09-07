package 自定义注解类;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestMyAnnotation {
	
	@MyAnnotation(value="hehe",num = { 1,2,3,4 })
	public void show() {
		
	}
	
	
	/*
	 * 通过    反射     获取注解信息的内容
	 */
	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		Class clazz = TestMyAnnotation.class;
		Method method = clazz.getMethod("show", null);
		if(method.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
			String value = annotation.value();
			int[] num = annotation.num();
			System.out.println("MyAnnotation 的  value = "+value);
			System.out.print("MyAnnotation 的数组  num = ");
			for(int i = 0; i < num.length; i++) {
				System.out.print(i+"  ");			
			}
		}else {
			System.out.println("无");
		}
	}
}
