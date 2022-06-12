package testMaximum;

public class MaxAtFirst {
	static float[] max() {
	return new	float [] {5.5f,5.0f,4.5f};
	}
	
public static void main(String[] args) {
	float arr[]=max();
	
	for(int i=0; i<arr.length; i++) {
		if (arr[0]<arr[i]) {
			arr[0]=arr[i];
		}
	}
	System.out.println(arr[0]);
}
}
