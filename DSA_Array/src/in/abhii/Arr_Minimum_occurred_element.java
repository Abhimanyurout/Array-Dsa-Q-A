package in.abhii;
// Minimum occurred element
public class Arr_Minimum_occurred_element {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 1, 2,2, 1,3,3,6,6,6,7,7};
		int minCount=Integer.MAX_VALUE;
		int minElement=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			int currCount=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					currCount++;
				}
			}
			if(currCount<minCount) {
				minCount=currCount;
				minElement=arr[i];
			}
		}
		System.out.println("Element " + minElement + " occurs min frequently (" + minCount + " times)");
	}
}
