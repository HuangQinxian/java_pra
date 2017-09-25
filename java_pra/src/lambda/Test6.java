package lambda;

//引用构造器
public class Test6 {
	public static void main(String[] args) {
//		形式一
//		MyInterface6 mi6 = (int id, String name)->new User(id,name);
		
//		形式二
		MyInterface6 mi6 = User::new;
		
		User user = mi6.getUser(1, "one");
		
		System.out.println(user.getId()+"-----"+user.getName());
	}
}
