package jianzhi01;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 */

public class Main {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = max;
				max++;
			}
		}
		boolean flag = new Main().Find(15,arr);
		System.out.println(flag);
	}

	public boolean Find(int target, int[][] array) {
		
		for(int i = array.length - 1; i >= 0; i--) {
			for(int j = 0; j < array[i].length; j++) {
				if(target == array[i][j]) {
					return true;
				}else if(target < array[i][j]) {
					break;
				}
				System.out.println(i + "---------" + j + "-----------" + array[i][j]);
			}
		}
		return false;
	}
}
