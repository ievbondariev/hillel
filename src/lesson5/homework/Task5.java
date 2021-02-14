package lesson5.homework;

import java.util.Scanner;

public class Task5 {

    /**
     * Последовательность Фибоначчи определяется так:
     * F(0) = 0, F(1) = 1, …, F(n) = F(n−1) + F(n−2).
     * Дано натуральное число A. Определите, каким по счету числом Фибоначчи оно является,
     * то есть выведите такое число N, что F(N) = A. Если А не является числом Фибоначчи, выведите число -1.
     *
     * Формат входных данных:
     * Вводится натуральное число A > 1.
     *
     * Формат выходных данных:
     * Выведите ответ на задачу.
     *
     * Sample Input:
     * 8
     *
     * Sample Output:
     * 6
     *
     * https://en.wikipedia.org/wiki/Fibonacci_number
     * RU: https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] f = new int[100];
        f[0] = 0;
        f[1] = 1;

        int i = 1;
        while (f[i] < a) {
            f[i + 1] = f[i] + f[i - 1];
            i++;
        }
            if (a == f[i]) {
                System.out.println(i);

            } else {
                System.out.println("-1");
            }
        }
    }
