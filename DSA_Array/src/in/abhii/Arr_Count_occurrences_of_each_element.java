package in.abhii;

import java.util.HashMap;

// Count occurrences of each element
public class Arr_Count_occurrences_of_each_element {
	public static void main(String[] args) {
		int[] arr={1, 2, 1, 3, 2, 4};
		HashMap<Integer, Integer> countMap=new HashMap<>();
		for(int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		for(int key : countMap.keySet()) {
			System.out.println(key + "-" + countMap.get(key)+", ");
		}
		
	}
}
