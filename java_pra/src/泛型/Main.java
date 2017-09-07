package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<?> list = new ArrayList<>();
//		？表示任意类型，此时不能添加任何元素
//		list.add(1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		test1(list2);
			
	}
	
	public static void test1(List<?> list) {
		Iterator<?> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
