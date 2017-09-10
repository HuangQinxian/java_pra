package three;

public class StudentSub extends Student {
	public String a = "public param";
	private String b = "private param";
	
	public void ma(){
		System.out.println("public method");
	}
	
	private void mb(){
		System.out.println("private method");
	}
}
