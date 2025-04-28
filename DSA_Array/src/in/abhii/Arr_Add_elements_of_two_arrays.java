package in.abhii;
//Add elements of two arrays
public class Arr_Add_elements_of_two_arrays {
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 4, 1};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 9};
        
        int maxLength=Math.max(arr1.length, arr2.length);
        int[] result=new int[maxLength];
        
        for(int i=0;i<maxLength;i++) {
        	int val1=i<arr1.length? arr1[i]:0;
        	int val2=i<arr2.length? arr2[i]:0;
        	result[i]=val1+val2;
        }
        for(int nums:result) {
        	System.out.print(nums+" ");
        }
	}

}
