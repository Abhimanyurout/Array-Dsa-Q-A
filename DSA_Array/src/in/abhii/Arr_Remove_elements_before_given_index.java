package in.abhii;

import java.util.Arrays;

//Remove elements before given index

public class Arr_Remove_elements_before_given_index {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 1, 3, 2};
        int index = 3;
        
        if(index>=0 && index<arr.length) {
        	int newArr[]= new int[arr.length-index];
        	System.arraycopy(arr, index, newArr, 0,arr.length- index);
        	System.out.println(Arrays.toString(newArr));
        }else {
        	System.out.println("Invalid index");
        }
	}
}
