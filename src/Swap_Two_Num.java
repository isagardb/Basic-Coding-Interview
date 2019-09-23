import java.util.*;
public class Swap_Two_Num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =a;
		int d =b;
		
		
		//Using + and - 
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
		
		//Using Ex-OR operator
		
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;
		System.out.println(c);
		System.out.println(d);
	}

}


/* 
input 

6
7

output

method 1

7
6

method 2

7
6


*/