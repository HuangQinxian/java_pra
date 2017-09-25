package 多态;

public class Parent {
	
	public String a = new String("hello world");
	
	public void eat(){
		System.out.println(a + " Parent eat "+show());
	}
	
	public void drink(){
		System.out.println("Parent drink");
	}
	
	public String show(){
		return new String("来自Parent "+a);
	}
	
}
