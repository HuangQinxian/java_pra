package 三个数比较大小;

public class Main {
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{5,2,9,8,4,8,3,1};
		int temp;
		//xuanzepaixu(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				 if(arr[j] > arr[j+1]) {
					 temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			}
			System.out.println("第"+(i+1)+"轮");
			show(arr);
		}
		
	}

	private static void show(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	private static void xuanzepaixu(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("第"+(i+1)+"轮");
			show(arr);
		}
	}
}
