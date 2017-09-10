package 修饰符2;

import 修饰符.A;

public class E extends A{
	//不同包的子类下
	public static void main(String[] args) {
//		private	出错
//		System.out.println(new A().a);
		
//		public
		System.out.println(new A().b);
		
//		default	出错
//		System.out.println(new A().e);
		
//		protected	出错
//		System.out.println(new A().f);
	}
}
