package in.abhii;
//Last index of given element
public class Arr_Last_index_of_given_element {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,6,5,3,7,3};
		int target=3;
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				lastIndex=i;
			}
		}
		System.out.println(lastIndex);
	}

}
