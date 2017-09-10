package try_catch_finally;

public class Test5 {
	public static void main(String[] args) {

		User user = Test5.ope();

		System.out.println(user.getId() + "   " + user.getName());

	}

	public static User ope() {
		User user = new User();
		user.setId(1);
		user.setName("try外");
		try {
			user.setName("try里");
			int c = 1/0;
			return user;
		} catch(Exception e){
			user.setName("catch里");
			return user;
		}
		finally {
			user.setName("finally里");
		}
	}
}

// 1   finally里
