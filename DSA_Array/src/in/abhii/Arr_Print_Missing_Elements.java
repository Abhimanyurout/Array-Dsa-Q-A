package in.abhii;

import java.util.HashSet;

//Print Missing Elements:

public class Arr_Print_Missing_Elements {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 13};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int n=max;
		
		HashSet<Integer> set=new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		System.out.print("Print Missing Element: ");
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
}
