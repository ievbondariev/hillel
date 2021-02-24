package lesson5.homework;

import java.util.Scanner;

public class Task4 {

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
     * Если соседних элементов одного знака нет - не выводите ничего.
     * Если таких пар соседей несколько - выведите первую пару.
     * <p>
     * Формат входных данных
     * В первой строке вводится количество элементов в массиве. Во второй строке вводятся элементы массива.
     * Все числа отличны от нуля.
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

        // TODO: array size = 5, array = { -1 2 -1 3 4 }; Expected output: 3 4

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
//        do {
//            n = scanner.nextInt();
//        } while ( arr.length !=n);


        for (int i = 1; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i - 1] > 0 && arr[i] > 0) {
                if (arr[i - 1] < arr[i]) {
                    System.out.println(arr[i - 1] + " " + arr[i]);
                } else {
                    System.out.println(arr[i] + " " + arr[i - 1]);
                }
                    break;
            }
            else if (arr[i - 1] < 0 && arr[i] < 0) {
                if  (arr[i - 1] < arr[i]) {
                    System.out.println(arr[i - 1] + " " + arr[i]);
                } else {
                    System.out.println(arr[i] + " " + arr[i - 1]);
                }
                    break;
                } else {
                System.out.println(" ");
            }
        }
    }
}




