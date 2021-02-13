package lesson5.lesson;

//import java.util.Arrays;
//import java.util.Scanner;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] arr; //= {1, 2, 3, 4, 5};
        arr = new int[]{1, 2, 3};
//        String[] arrSrt;
//        arr[0] = 5;
//        System.out.println(arr[0]);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int cell : arr) {
            System.out.println(cell);
        }

//        System.out.println(Arrays.toString(arr));

//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter any value: ");
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
