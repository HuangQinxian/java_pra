package try_catch_finally;

public class Test3 {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("try外");
		
		User user2 = Test3.ope(user);
		
		System.out.println(user2.getId()+"   "+user2.getName());
		
	}
	
	public static User ope(User user){
		try{
			user.setName("try里");
			return user;
		}finally{
			user.setName("finally里");
		}
	}
}

//结果      1   finally里
