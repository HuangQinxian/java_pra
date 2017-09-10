package 修饰符2;

import 修饰符.A;
import 修饰符.D;

public class C {
//	不同包
	public static void main(String[] args) {
//		private     出错
//		System.out.println(new A().a);
		
//		public修饰	正常
		System.out.println(new A().b);
		
//		default修饰	出错
//		System.out.println(new A().e);
		
//		protected修饰	出错
//		System.out.println(new A().f);
	}
}
