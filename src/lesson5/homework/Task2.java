package lesson5.homework;

import java.util.Scanner;

public class Task2 {


    private static Object breake;

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
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        int i = 0;
        while (n > Math.pow(2, i)) {
            i++;
            if (n > Math.pow(2, i)) {
            }else if (n == Math.pow(2, i)) {
                System.out.println("YES ");
            } else System.out.println("No");
        }
    }
}

