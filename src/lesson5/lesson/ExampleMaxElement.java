package lesson5.lesson;

import java.util.Scanner;

/**
 * The code finds max int value of sequence.
 */
public class ExampleMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
