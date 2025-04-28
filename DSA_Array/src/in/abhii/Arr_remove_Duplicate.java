package in.abhii;

import java.util.LinkedHashSet;
import java.util.Set;

//Remove duplicate form the  arrays
public class Arr_remove_Duplicate {
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		
		Set<Integer> uniqueEle=new LinkedHashSet<Integer>();
		for(int num :arr) {
			uniqueEle.add(num);
		}
		System.out.println("Array after removing duplicates: "+uniqueEle);
	}
}
