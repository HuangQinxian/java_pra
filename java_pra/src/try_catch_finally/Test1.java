package try_catch_finally;

/**
 * 在try中return
 */
public class Test1 {
	
	public static void main(String[] args) {
		System.out.println (test());
	}
	static int  test(){
		int x = 1;
		try{
			int y = 1/0;
			return  x;
		}catch(ArithmeticException e){
			System.out.println("捕获异常");
			return x;
		}finally{
			++x;
		}
	}
}

//结果是    1  
