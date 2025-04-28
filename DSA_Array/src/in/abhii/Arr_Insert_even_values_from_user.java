package in.abhii;

import java.util.Scanner;

//Insert even values from user
public class Arr_Insert_even_values_from_user {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			if(num % 2==0) {
				arr[i]=num;
			}else {
				arr[i]=-1;
			}
		}
		
		System.out.println("Arry even value are: ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}
