package in.abhii;

import java.util.Arrays;

//Shift half elements to right

public class Arr_Shift_half_elements_to_right {
	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 9, 3, 1};
		int half=arr.length/2;
		
		int[] result=new int[arr.length];
		
		for(int i=0;i<half;i++) {
			result[i]=arr[half+i];
		}
		for(int i=0;i<half;i++) {
			result[half+i]=arr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
