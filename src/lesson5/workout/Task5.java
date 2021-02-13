package lesson5.workout;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a1, b1, c1, a2, b2, c2;
        Scanner scanner = new Scanner(System.in);
        a1 = scanner.nextInt(); // max1
        b1 = scanner.nextInt(); // 1
        c1 = scanner.nextInt(); // min1
        a2 = scanner.nextInt(); // max2
        b2 = scanner.nextInt(); // 2
        c2 = scanner.nextInt(); // min2

        int temp;
        if (a1 < b1) {
            temp = a1;
            a1 = b1;
            b1 = temp;
        }
        if (a1 < c1) {
            temp = a1;
            a1 = c1;
            c1 = temp;
        }
        if (b1 < c1) {
            temp = b1;
            b1 = c1;
            c1 = b1;
        }

        if (a2 < b2) {
            temp = a2;
            a2 = b2;
            b2 = temp;
        }
        if (a2 < c2) {
            temp = a2;
            a2 = c2;
            c2 = temp;
        }
        if (b2 < c2) {
            temp = b2;
            b2 = c2;
            c2 = b2;
        }

        if (a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("equals");
        } else if (a1 >= a2 && b1 >= b2 && c1 >= c2) {
            System.out.println("1 >");
        } else if (a2 >= a1 && b2 >= b1 && c2 >= c1) {
            System.out.println("2 >");
        } else {
            System.out.println("gidota");
        }
    }
}
