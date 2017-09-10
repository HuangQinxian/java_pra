package try_catch_finally;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		System.out.println(Test6.ope());
		System.out.println(Test6.ope2());
		System.out.println(Test6.ope3());
		System.out.println(Test6.ope4().size());
	}
	
	public static String ope(){
		String str = new String("try 外");
		try{
			str = new String("try 里");
			return str;
		}finally{
			str = new String("finally 里");
		}
	}
	
	public static Integer ope2(){
		Integer ite = new Integer(1);
		try{
			ite = new Integer(2);
			return ite;
		}finally{
			ite = new Integer(3);
		}
	}
	
	public static Character ope3(){
		Character c = new Character('A');
		try{
			c = new Character('B');
			return c;
		}finally{
			c = new Character('C');
		}
	}
	
	public static List<Integer> ope4(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		try{
			list.add(2);
			return list;
		}finally{
			list.add(3);
		}
	}
}

//在finaly 里改变  String、Integer 类型的值， 最终返回的还是try里的值
//在finally里改变List，最终返回的是finally的值
