package logic;

public class calculation {
	public static int findMax(int[] arr) {
		int i=0;
		int max= arr[0];
		for(i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
