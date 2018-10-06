package freemarker_pra.one;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private String address;
	private Date birth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Student(){}
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student(int id, String name, String address, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birth = birth;
	}
	
}
