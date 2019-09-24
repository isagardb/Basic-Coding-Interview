package Strings;
import java.util.*;
public class Num_of_words_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		
		String[] words = str.split("\\s+");

		System.out.print(words.length);
	}

}

/*

input: I'm Drop Codes
output: 3

input: 	I'm 	Drop		Codes
output: 3

*/