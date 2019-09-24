package Strings;
import java.util.*;
public class Find_repeated_target_word_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		String str = sc.nextLine().trim();
		
		String str_target = sc.nextLine().trim();
		
		String[] str_word = str.split("\\s+");
		
		for(String k : str_word) {

			if(k.equals(str_target)) {
				count++;
			}
		}
		System.out.print(count);
	}
}

/*

input : Drop Codes Drop Codes
target: Drop
output: 2

*/