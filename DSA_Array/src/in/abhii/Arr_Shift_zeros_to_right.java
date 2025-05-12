package in.abhii;
//Shift zeros to right
public class Arr_Shift_zeros_to_right {
	public static void main(String[] args) {
		int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
