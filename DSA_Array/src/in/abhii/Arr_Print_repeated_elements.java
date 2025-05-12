package in.abhii;

import java.util.HashSet;

//Print repeated elements

public class Arr_Print_repeated_elements {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 3, 2};
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> repeated=new HashSet<>();
		
		for(int num : arr) {
			if(!set.add(num)) {
				repeated.add(num);
			}
		}
		System.out.print(repeated+" ");
	}
}
