package in.abhii;
//Binary search

public class Arr_Binary_search {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        int left=0;
        int right=arr.length-1;
        int index=-1;
        
        while(left<right) {
        	int mid=left+ (right-left) /2;
        	
        	if(arr[mid]==target) {
        		index=mid;
        		break;
        	}else if(arr[mid]<target) {
        		left=left+1;
        	}else {
        		right=right-1;
        	}
        }
        if(index !=-1) {
        	System.out.println("Element found at the index: "+ index);
        }else {
        	System.out.println("Element not found");
        }
	}
}
