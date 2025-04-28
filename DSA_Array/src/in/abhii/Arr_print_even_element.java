package in.abhii;
//Print even elements and Print odd elements
public class Arr_print_even_element {
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,6,5,7,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		//Print odd elements
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
