package in.abhii;

import java.util.ArrayList;
import java.util.HashMap;

//Remove elements present more than once

public class Arr_Remove_elements_present_more_than_once {
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3, 2, 4};
		
		HashMap<Integer, Integer> countMap=new HashMap<>();
		
		ArrayList<Integer> result=new ArrayList<>();
		
		for(int num: arr) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		for(int num:arr) {
			if(countMap.get(num)==1) {
				result.add(num);
			}
		}
		System.out.println(result);
	}

}








