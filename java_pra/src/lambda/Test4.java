package lambda;

public class Test4 {
	public static void main(String[] args) {
		
		MyInterface5 mi5 = String::substring;
		
		//引用某类对象的实例方法
		
		//函数式接口中被实现方法的第一个参数作为调用者
		//后面的参数全部传给该方法作为参数
		String result = mi5.mySubString("hello world", 1, 7);
		
		System.out.println(result);
		
	}
}
