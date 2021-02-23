package lesson7.lesson;

public class Methods2 {
    public static void main(String[] args) {
        int t = 5;
        System.out.println("Before: " + t);

        System.out.println("After: " + modifyT(t));
    }

    public static int modifyT(int t) {
        t = 9;
        System.out.println(t);
        return t;
    }
}
