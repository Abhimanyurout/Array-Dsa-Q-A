package in.abhii;
//Second largest element
public class Arr_Second_largest_element {
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3,5, 2, 4};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}else if(arr[i]>second && arr[i] !=first) {
				second=arr[i];
			}
		}
		System.out.println("The second element of the array is : "+second);
	}

}
