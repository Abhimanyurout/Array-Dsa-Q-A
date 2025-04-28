package in.abhii;
//Count zeros in array
public class Arr_Count_zeros_in_array {
	public static void main(String[] args) {
		int arr[]={1, 0, 3, 0, 5, 6, 0};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
