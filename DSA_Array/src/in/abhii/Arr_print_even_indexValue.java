package in.abhii;
//Print even index values

public class Arr_print_even_indexValue {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i +=2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Print odd index values
		for(int i=1;i<arr.length;i +=2) {
			System.out.print(arr[i]+" ");
		}
	}
}
