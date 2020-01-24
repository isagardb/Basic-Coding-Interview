package Reverse;
import java.util.*;
public class Reverse_Individual_Word {
		public static void main(String[]  args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			String[] word = s.split(" ");
			
			StringBuilder res = new StringBuilder();
 
			for(String k : word) {
				StringBuilder sb = new StringBuilder(k);
				sb.reverse();
				res.append(sb).append(" ");
			}
			System.out.print(res.toString().trim());
		}
}

/*

input 
im drop codes

output

mi pord sedoc


*/