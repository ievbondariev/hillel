package lesson5.homework;

import java.util.Scanner;
public class Task5 {

    /**
     * Последовательность Фибоначчи определяется так:
     * F(0) = 0, F(1) = 1, …, F(n) = F(n−1) + F(n−2).
     * Дано натуральное число A. Определите, каким по счету числом Фибоначчи оно является,
     * то есть выведите такое число N, что F(N) = A. Если А не является числом Фибоначчи, выведите число -1.
     * <p>
     * Формат входных данных:
     * Вводится натуральное число A > 1.
     * <p>
     * Формат выходных данных:
     * Выведите ответ на задачу.
     * <p>
     * Sample Input:
     * 8
     * <p>
     * Sample Output:
     * 6
     * <p>
     * https://en.wikipedia.org/wiki/Fibonacci_number
     * RU: https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8
     */



        public static void main(String[] args) {

            System.out.println("Введите число больше 0:  ");

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if (n <= 0){
                System.out.println("Фигня твое число, заново!");
            }

            int i = 0;
            int a = 1;
            int b = 0;
            int sum = 0;
            for (i = 0; i < n; i++) {
                int fibb = a + b;
                a = b;
                b = fibb;
                int d = i + 1;
                sum = d;
                if (n == fibb) {
                    System.out.println(d);
                 break;
                } if (n <= d) {
                    System.out.println("-1");
                   break;
                }
            }
        }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 0:  ");

        int n = scanner.nextInt();
        while(n <= 0) {
            System.out.println("Фигня твое число, заново!");
            System.out.println("Введите число больше 0:  ");
            n = scanner.nextInt();
        }

        int fib1 = 0;
        int fib2 = 1;
        for(int i = 1; i <= n; i++) {
            int fibNext = fib2 + fib1;
            fib1 = fib2;
            fib2 = fibNext;
            if (n == fibNext) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
    }

}










