package lesson7.lesson;

import java.util.Arrays;

public class Methods3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String arrStr = Arrays.toString(arr);
        System.out.println("Before: " + arrStr);

        modifyArr(arr);

        String arrStr2 = Arrays.toString(arr);
        System.out.println("After: " + arrStr2);
    }

    public static void modifyArr(int[] arr) {
        int[] arr1 = arr.clone();//new int[arr..length];
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i] = arr[i] + 1;
//        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] += 1;
        }
        String arrStr = Arrays.toString(arr1);
        System.out.println(arrStr);
    }


}
