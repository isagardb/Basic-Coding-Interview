package Reverse;

import java.util.Scanner;

public class Reverse_sentence_using_recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String res = Recursion(str);
        System.out.println(res);
    }
    public static String Recursion(String str){
        if (str.isEmpty()){
            return str;
        }
        return Recursion(str.substring(1))+str.charAt(0);
    }
}
/*

input: sagar gowda[space]
output: [space]adwog ragas


 */