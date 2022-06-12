package testMaximum;

public class MaxAtFirstInt {
	static int[] max() {
		return new	int [] {56,45,55};
		}
		
	public static void main(String[] args) {
		int arr[]=max();
		
		for(int i=0; i<arr.length; i++) {
			if (arr[0]<(arr[i])) {
				arr[0]=arr[i];
			}
		}
		System.out.println(arr[0]);
	}

}
