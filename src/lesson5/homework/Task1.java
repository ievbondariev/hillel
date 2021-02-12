package lesson5.homework;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {

    /**
     * По данному целому числу N распечатайте все квадраты натуральных чисел, не превосходящие N, в порядке возрастания.
     * <p>
     * Формат входных данных:
     * Вводится натуральное число.
     * <p>
     * Формат выходных данных:
     * Выведите ответ на задачу.
     * <p>
     * Sample Input:
     * 50
     * <p>
     * Sample Output:
     * 1 4 9 16 25 36 49
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i*i <= n) {
            System.out.println(i*i);
            i++;
            }
        }
    }

