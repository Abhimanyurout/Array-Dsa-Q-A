package in.abhii;
//Sum of digits until single digit

public class Arr_Sum_of_digits_until_single_digit {
	public static void main(String[] args) {
		int[] arr = {23, 55, 57, 93, 10, 1};
		for(int num: arr) {
			int sum=num;
			while(sum>9) {
				int temp=0;
				while(sum>0) {
					temp +=sum%10;
					sum /=10;
				}
				sum=temp;
			}
			System.out.print(sum+" ");
		}
	}
}
