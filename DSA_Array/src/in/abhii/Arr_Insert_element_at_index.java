package in.abhii;

import java.util.Arrays;

//Insert element at index

public class Arr_Insert_element_at_index {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4};
	        int index = 3;
	        int value = 5;
	        
	        int[] newArr= new int[arr.length+1];
	        
	        for(int i=0,j=0;i<newArr.length;i++) {
	        	if(i==index) {
	        		newArr[i]=value;
	        	}else {
	        		newArr[i]=arr[j++];
	        	}
	        }
	        System.out.println(Arrays.toString(newArr));
	}

}
