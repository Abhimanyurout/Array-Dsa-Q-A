package in.abhii;

import java.util.Arrays;

//Reverse an Array
public class Arr_Reverse {
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7};
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("The reverse array is :"+ Arrays.toString(arr));
	}
}
