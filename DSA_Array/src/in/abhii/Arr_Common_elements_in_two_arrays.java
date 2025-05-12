package in.abhii;

import java.util.HashSet;

//Common elements in two arrays

public class Arr_Common_elements_in_two_arrays {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 5, 8, 9, 3, 1};
        
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> common=new HashSet<>();
        
        for(int num:arr1) set.add(num);
        
        for(int num:arr2) {
        	if(set.contains(num)) {
        		common.add(num);
        	}
        }
      System.out.println(common);
	}

}
