package 接口;

public interface Test {
	public static final int b = 0;
	public static void show(){
		System.out.println("hello world");
	}
	default void ha() {
	}
	public abstract void eat();
	//接口
	//可以定义变量，但变量必须是public static final 修饰
	//可以定义普通方法，但方法必须是static 修饰
}
