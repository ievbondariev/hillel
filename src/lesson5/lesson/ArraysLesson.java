package lesson5.lesson;

//import java.util.Arrays;
//import java.util.Scanner;

public class ArraysLesson {
    public static void main(String[] args) {

        int[] arr; //= {1, 2, 3, 4, 5};
        arr = new int[]{1, 2, 3};
//        String[] arrSrt;

//        int[] arr = {1, 2, 3, 4, 5};
//        arr = new int[]{1, 2, 3, 4, 5};
        String[] arrSrt = new String[5];
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        for (int cell : arr) {
//            System.out.println(cell);
//        }


//        arr[0] = 5;
//        System.out.println(arr[0]);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int cell : arr) {
            System.out.println(cell);
        }

//        System.out.println(Arrays.toString(arr));

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter any value: ");
            arr[i] = scanner.nextInt();
        }


//        for (int cell : arr) {
//            System.out.println(cell);
//        }
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] < arr[i])
//                System.out.println(arr[i]);
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
