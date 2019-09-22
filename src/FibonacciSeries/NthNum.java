package FibonacciSeries;
import java.util.*;
public class NthNum {

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
