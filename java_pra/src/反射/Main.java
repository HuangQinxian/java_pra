package 反射;

import java.lang.reflect.Method;

public class Main {
	
	private Main() {}  //将构造方法私有
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.lang.String");
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName()+"  "+m.getParameterCount());
		}
	}
}
