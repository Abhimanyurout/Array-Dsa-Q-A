package in.abhii;
//print prime number

public class Arr_print_prime_Number {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int num :arr) {
			if(isPrime(num)) {
				System.out.print(num+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		
		for(int i=2;i <= Math.sqrt(num);i++) {
			if(num % 2==0) return false;
		}
		return true;
	}
	
}
