package in.abhii;

import java.util.LinkedHashSet;

//Remove duplicates
public class Arr_Remove_duplicates {
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3, 2, 4};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}
