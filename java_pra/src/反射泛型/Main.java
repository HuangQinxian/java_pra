package 反射泛型;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 泛型.Main2;

public class Main {
	private static final Type ParameterizedType = null;
	Map<String,Integer> map = new HashMap<String,Integer>();
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Map<String,Integer> map = new HashMap<String,Integer>();
		//show();
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		//show2("hello");
		
		test();
	}
	
	//获取类变量的泛型
	public static void show() throws NoSuchFieldException, SecurityException {
		Class clazz = Main.class;
		Field f = clazz.getDeclaredField("map");
		Class<?> type = f.getType();
		Type genericType = f.getGenericType();    //获取包含泛型的类型
		ParameterizedType pt = (ParameterizedType) genericType;
		Type rawType = pt.getRawType();           //获取变量的类型
		Type[] actualTypeArguments = pt.getActualTypeArguments();  //获取参数的泛型
		
		System.out.println(rawType);
		System.out.println("------------------------------------");
		for(Type t : actualTypeArguments) {
			System.out.println(t);
		}
	}
	
	//获取方法参数的类型
	public static void show2(String str) {
		Class clazz = Main.class;
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			if(m.getName().equals("show2")) {
				Class<?>[] parameterTypes = m.getParameterTypes();
				for(Class c : parameterTypes) {
					System.out.println(c.getTypeName());
				}
			}
		}
	}
	
	//带泛型参数的方法
	public <T> void show3(List<T> t) {
		System.out.println(t.size());
	}
	
	public static void test() throws InstantiationException, IllegalAccessException {
		Class clazz = Main.class;
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			if(m.getName().equals("show3")) {
				Type[] type = m.getGenericParameterTypes();
				for(Type t : type) {
					ParameterizedType pt = (ParameterizedType)t;
					System.out.println(pt.getTypeName());
//					Type rawType = pt.getRawType();
//					Type[] actualTypeArguments = pt.getActualTypeArguments();
//					for(Type at : actualTypeArguments) {
//						System.out.println(at.getTypeName());
//					}
				}
			}
		}
	}
	
}

