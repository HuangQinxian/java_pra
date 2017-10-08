package 整数数组求平均数;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7,9,10};
		float sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		System.out.printf("%9.2f",sum/a.length);  //9表示输出的长度，2表示小数位数
	}
}
