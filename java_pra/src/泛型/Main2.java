package 泛型;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();
		//list.add(1);     //错误，这种情况下不能添加任何元素
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(1);
		lis.add(2);
		add(lis);
	}
	
	public static void add(List<?> list) {
		List<Integer> lis = (List<Integer>) list;
		int sum = 0;
		for(Integer i : lis) {
			sum += i;
		}
		
//		for(Object o : list) {
//			sum += (Integer)o;
//		}
		
		System.out.println(sum);
	}
	
}
