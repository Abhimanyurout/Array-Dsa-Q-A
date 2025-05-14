package in.abhii;
// Linear search

public class Arr_Linear_search {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==target) {
        		index=i;
        	}
        }
        if(index!=0) {
        	System.out.println("Element fount at the index : "+index);
        }else {
        	System.out.println("Element not Found");
        }
	}

}
