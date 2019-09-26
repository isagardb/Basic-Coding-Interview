package Maths;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean res = prime(num);
		
		if(res == true) {
			System.out.print("Prime");
		}else {
			System.out.print("Not Prime");
		}

	}
	
	public static boolean prime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i = 2; i<num;i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

}

/*

input: 12
output: No Prime

input: 11
output: Prime 


*/