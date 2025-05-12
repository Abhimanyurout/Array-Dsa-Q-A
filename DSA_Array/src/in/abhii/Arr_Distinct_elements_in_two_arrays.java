package in.abhii;

import java.util.HashSet;

//Distinct elements in two arrays

public class Arr_Distinct_elements_in_two_arrays {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 5, 8, 9, 3, 1};
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(int num: arr1) set1.add(num);
        for(int num:arr2) set2.add(num);
        
        HashSet<Integer> distinct=new HashSet<>();
        for(int num:set1) {
        	if(!set2.contains(num)) {
        		distinct.add(num);
        	}
        }
        for(int num:set2) {
        	if(!set1.contains(num)) {
        		distinct.add(num);
        	}
        }
        System.out.println(distinct);
	}

}
