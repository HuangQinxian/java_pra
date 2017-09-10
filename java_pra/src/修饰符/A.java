package 修饰符;

public class A {
	private String a = "A private a";
	public String b = "A public b";
	String e = "A default e";
	protected String f = "A protected f";
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	//当前类
	public static void main(String[] args) {
//		private
		System.out.println(new A().a);
//		public
		System.out.println(new A().b);
//		default
		System.out.println(new A().e);
//		protected
		System.out.println(new A().f);
	}
}

