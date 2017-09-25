package 多态;

public class Test {
	public static void main(String[] args) {
		Parent parent = new Children();
		System.out.println(parent.show());
		
		System.out.println("----------");
		parent.eat();
	}
}
