package in.abhii;
//Square of each element

public class Arr_Square_of_each_element {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i] * arr[i];
			System.out.print(arr[i]+",");
		}
	}
}
