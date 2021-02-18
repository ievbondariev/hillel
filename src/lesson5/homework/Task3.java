package lesson5.homework;
import java.util.Scanner;
public class Task3 {

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     *
     * Ps. Имеется в виду что нужно читать новые знания пока мы не встретим 0.
     *
     * Формат входных данных:
     * Вводится последовательность целых чисел, оканчивающаяся числом 0
     * (само число 0 в последовательность не входит, а служит как признак ее окончания.
     *
     * Формат выходных данных:
     * Выведите ответ на задачу.
     *
     * Sample Input:
     * 3
     * 6
     * 8
     * 0
     *
     * Sample Output:
     * 17
     *
     */
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num;
            num = input.nextInt();
        }
        System.out.println(sum);
    }
}
