package in.abhii;
//Check if an Array is Sorted
public class Arr_isSorted {
	public static boolean isSorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr[]= {3,3,5,7};
		System.out.println("Is sorted the array :"+isSorted(arr));
	}
}
