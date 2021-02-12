package lesson5.homework;

import java.util.Scanner;

public class Task2 {

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
     * или слово NO в противном случае.
     * <p>
     * Формат входных данных:
     * Вводится натуральное число.
     * <p>
     * Формат выходных данных:
     * Выведите ответ на задачу.
     * <p>
     * Sample Input 1:
     * 1
     * Sample Output 1:
     * YES
     * <p>
     * Sample Input 2:
     * 2
     * Sample Output 2:
     * YES
     */
    public static void main(String[] args) {
       //  write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scanner.nextInt();

        if((n > 1) && ((n & (n - 1)) == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
