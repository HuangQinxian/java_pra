package 线程;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.setDaemon(true);
		a.start();
		new B().start();
	}
}
