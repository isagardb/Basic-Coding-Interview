import java.util.*;
public class Chech_Char_Vowel_Const {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		boolean check = false;
		
		switch(c) {
		case 'a' : check = true;
		break;
		case 'e' : check = true;
		break;
		case 'i' : check = true;
		break;
		case 'o' : check = true;
		break;
		case 'u' : check = true;
		break;
		case 'A' : check = true;
		break;
		case 'E' : check = true;
		break;
		case 'I' : check = true;
		break;
		case 'O' : check = true;
		break;
		case 'U' : check = true;
		break;
		default: check = false;
		}
		
		if(check == true) {
			System.out.print("Vowel");
		}else {
			System.out.print("Consonant");
		}
	}

}

/*
 * 
 * input : a
 * output: Vowel
 * 
 * input : s
 * output: Consonant 
 * 
 * 
 */
