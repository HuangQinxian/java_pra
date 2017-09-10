package three;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class5<? super User> class5 = new Class5<User>();
		Student t = new Student();
		t.setId(1);
		t.setName("one");
		class5.set(t);
		
		User user = class5.get();
		System.out.println(user.getId()+"  "+user.getName());
		
	}
}
