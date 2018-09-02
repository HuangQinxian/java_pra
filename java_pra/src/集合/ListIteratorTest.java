package 集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
/**
 * Iterater和ListIterator之间有什么区别？
 *（1）Iterator来遍历Set和List集合，而ListIterator只能遍历List。
 *（2）Iterator只可以向前遍历，而ListIterator可以双向遍历。
 *（3）ListIterator从Iterator接口继承，然后添加了一些额外的功能，比如添加一个元素、替换一个元素、获取前面或后面元素的索引位置。	
 */
	public static void main(String[] args) {
		List<User> list = new ArrayList();
		list.add(new User(1,"one"));
		list.add(new User(2,"two"));
		list.add(new User(3,"three"));
		
		ListIterator<User> it = list.listIterator();
		it.add(new User(4,"four")); //ListIterator新增了add方法
		it.add(new User(5,"five")); 
		it.add(new User(6,"six"));
		
		while(it.hasNext()) {
			System.out.println(it.nextIndex());
			User u = it.next();
			System.out.println(u);
		}
		
//		for(User u : list) {
//			System.out.println(u);
//		}
	}

}