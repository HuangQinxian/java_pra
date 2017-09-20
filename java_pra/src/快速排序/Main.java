package 快速排序;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		sc.close();
		String[] inputArr = inputStr.trim().split(",");
		Integer[] inArr = new Integer[inputArr.length];
		if(inputArr != null) {
			for(int i = 0; i < inputArr.length; i++) {
				inArr[i] = Integer.valueOf(inputArr[i]);
			}
		}

		sort(inArr,0,inArr.length-1);
		
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < inArr.length; i++)
			sb.append(inArr[i]+" ");
		System.out.println(sb.toString().trim());
		
	}
	
	public static void sort(Integer[] arr, int begin, int end) {
		if(begin >= end)
			return;
		if(arr.length > 0) {
			int min = arr[begin];
			int i = begin;
			int j = end;
			while(i < j) {
//				System.out.println("cycling...");
				while(i < j && arr[j] >= min)
					j--;
				arr[i] = arr[j];
				while(i < j && arr[i] < min)
					i++;
				arr[j] = arr[i];
			}
			arr[i] = min;
			sort(arr,begin,i-1);
			sort(arr,i+1,end);
		}
	}
}

//12,1,50,8,9,8,6,7,10,3 