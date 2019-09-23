package Maths;
import java.util.*;
public class Factorial {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			int res = fact(num);
			System.out.print(res);
		}
		
		public static int fact(int num) {
			if(num==1) {
				return 1;
			}
			
			return fact(num-1) * num;
		}
}

/*

input : 10
output : 3628800


*/