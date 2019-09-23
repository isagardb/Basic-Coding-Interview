package Reverse;
import java.util.*;
public class Reverse_Sentence {
	public static void main(String[]  args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char[] arr = new char[s.length()];
		
		int count = 0;
		
		for(int i = s.length()-1;i>=0;i--) {
			
			if(count!=s.length()) {
				arr[count] = s.charAt(i);
				count++;
			}
		}
		
		String rev = new String(arr);
		System.out.print(rev);
	}
}

/*

input 

Im Drop Codes

output 

sedoC porD mI


*/