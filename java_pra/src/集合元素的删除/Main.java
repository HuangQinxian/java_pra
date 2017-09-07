package 集合元素的删除;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//one(list);
		two(list);
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}

	//方法二
	private static void two(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 2) {
				list.remove(i);
				i--;
			}
		}
	}

	//方法一
	private static void one(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			if(next == 2) {
				it.remove();
			}
		};
	}
	
}
