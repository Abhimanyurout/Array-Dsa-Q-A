package in.abhii;
//Sum of even digits of each element

public class Arr_Sum_of_even_digits_of_each_element {
	public static void main(String[] args) {
		int[] arr = {231, 554, 572, 962, 24, 1};
		
		for(int num:arr) {
			int sum=0;
			while(num>0) {
				int digit=num%10;
				if(digit % 2==0) {
					sum=sum+digit;
				}
				num=num/10;
			}
			System.out.print(sum+" ");
		}
	}

}
