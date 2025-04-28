package in.abhii;
//Find the Second Largest Element in an Array
public class Arr_secoundLargest_element {
	public static void main(String[] args) {
		int[] arr = {10, 25, 78, 98, 30};
		int firstMax=Integer.MIN_VALUE ,secondMax=Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num>firstMax) {
				secondMax=firstMax;
				firstMax=num;
			}else if(num > secondMax && num !=firstMax){
				secondMax=num;
				
			}
		}
		System.out.println("the Second Largest Element in an Array is : "+secondMax);
	}
}
