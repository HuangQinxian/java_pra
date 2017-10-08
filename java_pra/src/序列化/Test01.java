package 序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化的对象必须实现序列化接口
 * 对象的类名和属性（static、transient修饰的除外）会被序列化，方法不会
 *
 */
public class Test01 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//xuliehua();
		fanxuliehua();
	}

	//反序列化
	private static void fanxuliehua() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/序列化/data.txt"));
		User user = (User)inputStream.readObject();
		System.out.println(user.getId()+"  "+user.getName());
	}

	//序列化
	private static void xuliehua() throws IOException, FileNotFoundException {
		User user = new User();
		user.setId(1);
		user.setName("one");
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src/序列化/data.txt")));
		outputStream.writeObject(user);
		outputStream.close();
	}
}
