package fanxing;

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
		p.eat();
//		p.he();
		System.out.println(p.a);
//		System.out.println(p.b);
		Child c = new Child();
		c.show();
		c.eat();
		c.he();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
