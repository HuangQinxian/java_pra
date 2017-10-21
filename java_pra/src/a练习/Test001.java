package a练习;

public class Test001 {
	static int i;
	static{
		i += 5;
	}
	public static void main(String[] args) {
		System.out.println(i);
	}
	static{
		i += 5;
	}
}
