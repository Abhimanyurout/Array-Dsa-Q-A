package in.abhii;
//Find the Largest and smallest Element in an Array
public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {10,12,4,54};
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else {
				min=arr[i];
			}
		}
		System.out.println("The max element of the array is :"+max);
		System.out.println("The min element of the array is :"+min);
	}	
}
