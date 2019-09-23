package FibonacciSeries;
import java.util.*;
public class Print_till_Nth_Num {

	public static void main(String ags[]) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");

		for(int i = 2;i<n;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	
	}
}

/*

input
10
output
0 1 1 2 3 5 8 13 21 34 


*/