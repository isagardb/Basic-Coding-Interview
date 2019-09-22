package Palindrome;
import java.util.*;
public class Reverse_Individual_Word {
		public static void main(String[]  args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			String word[] = s.split(" ");
			
			String res = "";
 
			for(String k : word) {
				StringBuilder sb = new StringBuilder(k);
				sb.reverse();
				res = res + sb+" ";
			}
			System.out.print(res.trim());
		}
}

/*

input 
im drop codes

output

mi pord sedoc


*/