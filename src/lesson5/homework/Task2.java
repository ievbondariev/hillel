package lesson5.homework;
import java.util.Scanner;
public class Task2 {

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
     * или слово NO в противном случае.
     *
     * Формат входных данных:
     * Вводится натуральное число.
     *
     * Формат выходных данных:
     * Выведите ответ на задачу.
     *
     * Sample Input 1:
     * 1
     * Sample Output 1:
     * YES
     *
     * Sample Input 2:
     * 2
     * Sample Output 2:
     * YES
     */
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = input.nextInt();

        while (num != 1 && num % 2 == 0) {
            num /= 2;
        }

        System.out.println(num == 1 ? "YES" : "NO");
        }
    }

