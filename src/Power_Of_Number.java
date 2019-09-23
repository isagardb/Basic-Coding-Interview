import java.util.*;
public class Power_Of_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int pow = sc.nextInt();
		
		int x = num ;
		
		for(int i = 1;i<pow;i++) {
			num *= x;
		}
		
		System.out.print(num);

	}

}

/*
input: 5 (number)
	   5 (power)
	   
output: 3125



*/