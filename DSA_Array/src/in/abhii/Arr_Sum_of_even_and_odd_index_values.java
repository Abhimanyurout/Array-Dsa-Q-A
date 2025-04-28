package in.abhii;
//Sum of even and odd index values
public class Arr_Sum_of_even_and_odd_index_values {
	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5, 6};
		int evenSum=0,oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenSum +=arr[i];
			}else {
				oddSum +=arr[i];
			}
		}
		System.out.println("Sum of even "+evenSum);
		System.out.println("Sum of Odd "+oddSum);
		
	}

}
