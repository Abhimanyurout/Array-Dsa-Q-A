package in.abhii;
//Maximum occurred element
public class Arr_Maximum_occurred_element {
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3, 1, 4};
		
		int maxCount=0;
		int maxElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			int currCount=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					currCount++;
				}
			}
			if(currCount>maxCount) {
				maxCount=currCount;
				maxElement=arr[i];
			}
		}
		System.out.println("Element " + maxElement + " occurs most frequently (" + maxCount + " times)");
		
	}

}
