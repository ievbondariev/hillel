package lesson7.lesson;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String end = "end";
//        for (int i = 0; i < 5; i++) {
//            test("loop"); // -> System.out.println("Test:| Label=" + "loop");
//        }
//        test(end); // -> System.out.println("Test:| Label=" + end);

//        for (int i = 0; i < 5; i++) {
//            loopTest("loop", i);
//        }
//        System.out.println(test(end));

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Print any number? ");
//        int n = scanner.nextInt();
//
//        printIfNot5(n);

        System.out.print("Print your name: ");
        String name = scanner.next();
        String convertedName = convertName(name);
        System.out.println(convertedName);

        System.out.println("Print your age? ");
        int age = scanner.nextInt();
        if (validateAge(age)) {
            System.out.println("Hello!");
        } else {
            System.out.println("Sorry! ;(");
        }
    }

    public static String convertName(String name) {
        return "[" + name + "]";
    }

    public static boolean validateAge(int age) {
        return age >= 18;
    }

//    public static void printDouble(double d) {
//        System.out.println(d);
//    }
//
//    public static void printIfNot5(int n) {
//        if (n == 5) {
//            System.out.println("We cant write 5!");
//        } else {
//            System.out.println(n);
//        }
//    }

//    public static String test(String testLabel) {
//        return "Test:| Label=" + testLabel;
//    }
//
//    public static void loopTest(String testLabel, int i) {
//        String testResult = test(testLabel);
//        System.out.println(testResult + " i=" + i);
//    }
}
