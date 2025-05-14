package in.abhii;
//Copy array using arraycopy()

public class Arr_Copy_array_using_arraycopy_method {
	public static void main(String[] args) {
		int[] source = {1, 2, 3, 4, 5};
		int[] destination= new int[source.length];
		
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int num: destination) {
			System.out.print(num+" ");
		}
	}

}
