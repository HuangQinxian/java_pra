package string类;

/**
 * 
 * String类被final修饰，不可变，不能被继承，因为它很完美
 *
 */
public class Main {
	public static void main(String[] args) {
		String s = "aaa";
		String s2 = appendStr(s);
		System.out.println(s);        //结果还是 aaa    ,这时，你只要把它当成基本数据类型看就行
	}
	
	public static String appendStr(String s){
		s += "bbb";
		return s;
	}
}
