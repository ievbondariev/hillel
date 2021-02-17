import java.util.Scanner;

public class Task1 {
//
//    /**
//     * По данному целому числу N распечатайте все квадраты натуральных чисел, не превосходящие N, в порядке возрастания.
//     *
//     * Формат входных данных:
//     * Вводится натуральное число.
//     *
//     * Формат выходных данных:
//     * Выведите ответ на задачу.
//     *
//     * Sample Input:
//     * 50
//     *
//     * Sample Output:
//     * 1 4 9 16 25 36 49
//     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 0; i*i <= n; i++) {

            System.out.println(i*i);
        }


    }
}
