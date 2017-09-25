package lambda;

/**
 * 		类名：：类方法
 *		对象：：实例方法
 *		类名：：实例方法
 *		类名：：new
 */

//方法引用
public class Test2 {

	public static void main(String[] args) {
		//实现MyInterface3中的抽象方法    (相当于实现了接口)
		//lambda表达式由于只有一句代码，所有省略    {} 和     return
//		形式一
//		MyInterface3 mi3 = (String str)->Integer.valueOf(str);
//		形式二
		MyInterface3 mi3 = Integer::valueOf;
		
		//调用实现后的方法
		Integer result = mi3.comverter("4000");
		
		//输出结果
		System.out.println(result);
		
	}
}
