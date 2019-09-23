import java.util.*;
public class Leap_Year {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean leap = checkLeap(year);
		
		if(leap == true) {
			System.out.print("Leap year");
		}else {
			System.out.print("Not Leap year");
		}
				
	}
	
	public static boolean checkLeap(int year) {
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
}
