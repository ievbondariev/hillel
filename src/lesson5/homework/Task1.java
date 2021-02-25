package lesson5.homework;

import java.util.Scanner;

public class Task1 {

    /**
     * По данному целому числу N распечатайте все квадраты натуральных чисел, не превосходящие N, в порядке возрастания.
     *
     * Формат входных данных:
     * Вводится натуральное число.
     *
     * Формат выходных данных:
     * Выведите ответ на задачу.
     *
     * Sample Input:
     * 50
     *
     * Sample Output:
     * 1 4 9 16 25 36 49
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        for (i = 1; i*i <= N; i++) {
            System.out.println(i*i);
        }
    }
}
