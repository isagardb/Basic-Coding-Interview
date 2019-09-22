package Palindrome;
import java.util.*;
public class ReverseSentence {
	public static void main(String[]  args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i = s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i));
		}
	
	}
}

/*

input 

Im Drop Codes

output 

sedoC porD mI


*/