package in.abhii;
//Second smallest element

public class Arr_Second_smallest_element {
	public static void main(String[] args) {
		int arr[]= {9,4,3,5,4,5,2};
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first) {
				second=first;
				first=arr[i];
			}else if(arr[i]<second && arr[i]!=first) {
				second=arr[i];
			}
		}
		System.out.println("The Second smallest element of the array is : "+second);
	}

}
