package Reverse;
import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
		
			int x = num%10;
			sum = (sum*10) + x;
			num = num/10;
			
		}
		System.out.print(sum);

	}

}

/*

input: 123

output: 321

PROBLEM 

if number ends with 0 or has 0

input: 120
output: 21

if any one has solution please feel free to contribute.


*/