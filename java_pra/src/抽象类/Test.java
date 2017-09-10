package 抽象类;

public abstract class Test{
	private int b;
	private final int d = 0;
	public static int a = 0;
	public final static int c = 0;
	public void show(){
		System.out.println("hello world");
	}
	public Test(){
		
	}
	public abstract void eat();
	protected abstract void ha();
	abstract void pra();
	
	//抽象类
	//比普通类多了抽象方法,抽象方法只能是public和protected修饰
}
