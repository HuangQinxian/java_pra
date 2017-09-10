package try_catch_finally;

public class Teste2 {
	public static void main(String[] args) {
		System.out.println (test());
	}
	static int  test(){
		int x = 1;
		try{
			return  x;
		}finally{
			++x;
		}
	}
}

//结果是    1  