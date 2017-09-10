package three;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = Class.forName("three.StudentSub");
		Object newInstance = clazz.newInstance();
		Field[] fields = clazz.getFields();
		for(Field f : fields){
			System.out.println(f);
		}
		Field[] fields2 = clazz.getDeclaredFields();
		for(Field f : fields2){
			System.out.println(f);
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods){
			m.setAccessible(true);
			System.out.print(m+"      ");
			m.invoke(newInstance,null);
		}
	}
}

