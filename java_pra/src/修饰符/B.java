package 修饰符;

public class B {
	//同一包下
	public static void main(String[] args) {
//		private	出错
//		System.out.println(new A().a);
//		public
		System.out.println(new A().b);
//		default
		System.out.println(new A().e);
//		protected
		System.out.println(new A().f);
	}
}
