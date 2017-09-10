package three;

public class Class5<T extends User> {
	T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
}
