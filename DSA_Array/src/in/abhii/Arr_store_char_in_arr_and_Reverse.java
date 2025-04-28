package in.abhii;
//Print characters in reverse order
public class Arr_store_char_in_arr_and_Reverse {
	public static void main(String[] args) {
		char[] chars = {'a', 'b', 'c', 'd', 'e'};
		for(int i=chars.length-1; i>=0;i--) {
			System.out.print(chars[i]+", ");
		}
	}

}
