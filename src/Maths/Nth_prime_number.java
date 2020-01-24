package Maths;

import java.util.Scanner;

public class Nth_prime_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        prime(x);
    }

    public static void prime(int x) {

        for (int i = 2; i <= x; i++) {
            for (int j = 2 ;j <= Math.sqrt(x);j++){
                if (x%j==0){

                }
            }
        }
    }
}
