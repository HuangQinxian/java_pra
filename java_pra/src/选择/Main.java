package 选择;

public class Main {

	public static void sort(int[] arr) {
		int max;
		for(int i = 0; i < arr.length - 1; i++) {
			int index = i;
			max = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
					index = j;
				}
			}
			if(i != index) {
				arr[index] = arr[i];
				arr[i] = max;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{4,6,2,9,4,6,7,1,7,0,3};
		sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
}
