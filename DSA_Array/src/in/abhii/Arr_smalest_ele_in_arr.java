package in.abhii;
//Smallest element of the array 
public class Arr_smalest_ele_in_arr {
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,5,8,7};
		
		int smalest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smalest) {
				smalest=arr[i];
			}
		}
		System.out.println("Largest element in array is ="+smalest);

	
	}

}
