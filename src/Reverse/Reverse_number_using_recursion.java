package Reverse;

import java.util.Scanner;

public class Reverse_number_using_recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Recursion(num);
    }

    public static void Recursion(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            Recursion(num / 10);
        }
    }
}
/*

input: 1032090
output: 0902301
 */