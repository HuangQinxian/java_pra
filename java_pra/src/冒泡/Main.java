package 冒泡;

public class Main {
	public static void sort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr.length-1; j > i; j--) {
				if(arr[j] > arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,6,8,9,2,5,4,8,1};
		sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
