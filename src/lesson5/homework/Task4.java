package lesson5.homework;

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
        int[] arr;
        arr = new int[]{1, -2, 3, 4, -5, 7, 1, -2, 1, -3};
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0 && arr[i + 1] < 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);
            }
            break; }
            for (int j = 0; j < 10; j++) {
                if (arr[j] > 0 && arr[j + 1] > 0) {
                    System.out.println(arr[j] + " " + arr[j + 1]);
                } else System.out.println();

            }
        }
    }

