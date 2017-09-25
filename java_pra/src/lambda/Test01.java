package lambda;

public class Test01 {
	
	public  void show(MyInterface mi){
		System.out.println("MyInterface 接口");
		mi.show();
	}
	
	public void eat(MyInterface2 mi2){
		System.out.println("MyInterface2 接口");
		mi2.eat("鸡腿");
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		//调用MyInterface的无参show方法
		t.show(()->{
			System.out.println("MyInterface的无参show方法");
		});
		
		
		//调用MyInterface2的带参构造方法
		t.eat((String str)->{
			System.out.println("MyInterface的带参eat方法"+str);
		});
		
		
	}
}


