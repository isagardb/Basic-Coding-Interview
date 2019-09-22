package FibonacciSeries;
import java.util.*;
public class FindNthFiboNum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int res = fibo(n);
			System.out.print(res);
		}
		
		public static int fibo(int n) {
			
			if(n==0)
				return 0;
			if(n==1)
				return 1;
			
			return fibo(n-2)+fibo(n-1);
		}
}
