package in.abhii;
// Largest element in array

public class Arr_Largest_element_in_array {
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,5,8,7};
		int largest=Integer.MIN_VALUE;
		int smalest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element in array is ="+largest);

	}
	

}
