package Miscellaneous;

import java.util.Scanner;

public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}

/*
input: 5

output:
1
2 3
4 5 6
7 8 9 10
 */