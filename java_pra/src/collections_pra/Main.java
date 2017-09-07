package collections_pra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		show(list);
		
		Collections.reverse(list);
		
		show(list);
		
		Collections.rotate(list, 2);
		show(list);
		
		Object[] arr =  list.toArray();
		for(Object i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void show(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
}
