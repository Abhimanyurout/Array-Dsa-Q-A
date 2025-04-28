package in.abhii;
//Reverse each element
public class Arr_Reverse_each_element {
	public static void main(String[] args) {
		int[] arr = {23, 55, 57, 93, 1};
		
		for(int num : arr) {
			int reverse=0;
			while(num!=0) {
				reverse =reverse*10 + num%10;
				num=num/10;
			}
			System.out.print(reverse+",");
		}
	}
	
}
