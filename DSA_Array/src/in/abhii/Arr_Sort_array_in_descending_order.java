package in.abhii;

import java.util.Arrays;
import java.util.Collections;

//Sort array in descending order

public class Arr_Sort_array_in_descending_order {
	public static void main(String[] args) {
		Integer[] arr = {9, 5, 6, 1, 2, 7};
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
	}

}
