package lesson5.homework;


import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     * <p>
     * Ps. Имеется в виду что нужно читать новые знания пока мы не встретим 0.
     * <p>
     * Формат входных данных:
     * Вводится последовательность целых чисел, оканчивающаяся числом 0
     * (само число 0 в последовательность не входит, а служит как признак ее окончания.
     * <p>
     * Формат выходных данных:
     * Выведите ответ на задачу.
     * <p>
     * Sample Input:
     * 3
     * 6
     * 8
     * 0
     * <p>
     * Sample Output:
     * 17
     */
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                int i = 0;
                while((i = scanner.nextInt()) != 0) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }
