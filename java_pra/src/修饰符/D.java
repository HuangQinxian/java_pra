package 修饰符;

public class D extends A{
	//同一包的子类下
	public static void main(String[] args) {
//		private 修饰的变量不能直接访问
//		System.out.println(new A().a);
		System.out.println(new A().b);
		System.out.println(new A().e);
		System.out.println(new A().f);
	}
}
