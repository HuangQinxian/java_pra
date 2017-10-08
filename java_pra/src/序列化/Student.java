package 序列化;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Student extends Person implements Serializable{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	在此处我们用到了writeObject/ readObject方法，这对方法如果存在的话，序列化时就会被调用，以代替默认的行为
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeInt(this.getAge());
		out.writeUTF(this.getName());
	}
	
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
		in.defaultReadObject();
		this.setId(in.readInt());
		this.setName(in.readUTF());
	}
}
