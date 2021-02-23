package lesson7.lesson;

public class Methods5 {

    public static int number = 5;

    public static void main(String[] args) {
        System.out.println("Before: " + number);

        modifyNumber();

        System.out.println("After: " + number);
    }

    public static void modifyNumber() {
        number = 10;
    }
}
