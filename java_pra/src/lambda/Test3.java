package lambda;

public class Test3 {
	public static void main(String[] args) {
		String str = "hello world";
		
		//引用特定对象的实例方法
		MyInterface4 mi4 = str::indexOf;
		
		int result = mi4.indexOf("wo");
		System.out.println(result);
	}
}
