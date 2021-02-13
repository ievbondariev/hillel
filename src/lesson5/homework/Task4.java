package lesson5.homework;
import java.util.Scanner;

public class Task4 {

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
     * Если соседних элементов одного знака нет - не выводите ничего.
     * Если таких пар соседей несколько - выведите первую пару.
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
     * @return
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива:  ");
        int n = in.nextInt();


        int[] a = new int[n];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();

        } for (int i = 1; i < n; i++)

            if (a[i] > 0 && a[i-1] > 0 || a[i] < 0 && a[i-1] < 0){

                System.out.println("Два соседних элемента одного знака: " + a[i-1] + " " + a[i]);
                break;

            }
        }
}


