package try_catch_finally;

public class Test4 {
	public static void main(String[] args) {
		
		
		User user = Test4.ope();
		
		System.out.println(user.getId()+"   "+user.getName());
		
	}
	
	public static User ope(){
		User user = new User();
		user.setId(1);
		user.setName("try外");
		try{
			user.setName("try里");
			return user;
		}finally{
			user.setName("finally里");
		}
	}
}

//1   finally里