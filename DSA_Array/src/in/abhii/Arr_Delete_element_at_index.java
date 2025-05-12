package in.abhii;

import java.util.Arrays;

//Delete element at index

public class Arr_Delete_element_at_index {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
        int index = 2;
        
        int[] newArr=new int[arr.length-1];
        
        for(int i=0,j=0;i<arr.length;i++) {
        	if(i!=index) {
        		newArr[j++]=arr[i];
        	}
        }
        System.out.println(Arrays.toString(newArr));
	}

}
