package 多态;

public class Children extends Parent{
	
	public String a = new String("hello world");
	
	public String show(){
		return new String("来自Children "+a);
	}
	
}
