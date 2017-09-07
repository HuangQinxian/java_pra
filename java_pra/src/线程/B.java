package 线程;

public class B extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 50; i++) {
			System.out.println("B  "+i);
			try {
				this.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
