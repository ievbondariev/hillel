package lesson5.homework;
import java.util.Scanner;
public class Task4 {

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа. Если соседних элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько - выведите первую пару.
     * <p>
     * Формат входных данных
     * В первой строке вводится количество элементов в массиве. Во второй строке вводятся элементы массива. Все числа отличны от нуля.
     * Формат выходных данных
     * Выведите ответ на задачу. Элементы выводятся в порядке неубывания.
     * <p>
     * Sample Input:
     * 5
     * -1 2 3 -1 -2
     * <p>
     * Sample Output:
     * 2 3
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int massive = scanner.nextInt();
        int[] arr = new int[massive];

        for (int i = 0; i < massive; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < massive; i++)
            if (arr[i] > 0 && arr[i-1]>0 || arr[i] < 0 && arr[i-1]<0) {
                System.out.println(arr[i-1] + " " + arr[i]);
                break;
        }
    }
}