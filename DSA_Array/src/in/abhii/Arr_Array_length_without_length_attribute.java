package in.abhii;
//Array length without length attribute

public class Arr_Array_length_without_length_attribute {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int length=0;
		
		try {
			while(true) {
				int temp=arr[length];
				length++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array length : "+length);
		}
	}

}
