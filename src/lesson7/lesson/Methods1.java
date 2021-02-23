package lesson7.lesson;

public class Methods1 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        int n3 = 6;
        int n4 = 2;

        int min = min(n1, n2, n3, n4);
        System.out.println(min);
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
}
