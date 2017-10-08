package 序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 父类没有实现序列化接口，子类实现了
 * 要序列化子类，需满足以下要求
 * 1. 父类要有无参构造方法
 * 2. 子类要序列化自身，还要负责序列化父类
 * 		具体：
 * 		a. 添加 private void writeObject(ObjectOutputStream out)
 * 		b. 添加 private void readObject(ObjectInputStream in)
 * 
 */
public class Test02 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		xuliehua();
		fanxuliehua();
	}

	private static void fanxuliehua() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/序列化/data.txt"));
		Student s = (Student)inputStream.readObject();
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
		inputStream.close();
	}

	private static void xuliehua() throws IOException, FileNotFoundException {
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src/序列化/data.txt")));
		Student s = new Student();
		s.setId(1);
		s.setName("oliver");
		s.setAge(23);
		outputStream.writeObject(s);
		outputStream.close();
		System.out.println("写入完成");
	}
}
