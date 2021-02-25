package lesson7.lesson;

public class Methods6 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialIter(int n) {
        int factorial = 1;
        while (n != 1) {
            factorial *= n--;
        }
        return factorial;
    }
}
