package in.abhii;
//. Print vowels in array
public class Arr_print_vowels {
	public static void main(String[] args) {
		char[] chars= {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		for(char c : chars) {
			if(isVowel(c)) {
				System.out.print(c+" ");
			}
		}
	}
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}
