package in.abhii;
//Shift zeros to left

public class Arr_Shift_zeros_to_left {
	public static void main(String[] args) {
		int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};
		int count=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[count--]=arr[i];
			}
		}
		while(count>=0) {
			arr[count--]=0;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
