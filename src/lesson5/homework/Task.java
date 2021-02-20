package lesson6.homework;

import java.util.Scanner;

public class Task {

    /**
     * Создайте своего собственного чат бота) Алгоритм прост, спрашиваете у пользователя команду,
     * и делаете то что он просит) Команды могут быть любые, например:
     * Посчитать площадь прямоугольника или треугольника, посчитать суму чисел, высчитать среднее арифметическое чисел,
     * просто поприветствовать кого-то или даже нарисовать единорога в консоли с помощью чёрточек и ноликов, что угодно,
     * включайте фантазию))))
     *
     * PS. Чем оригинальнее и необычнее тем круче, жду ваших свершений) Ну и + доделать прошлое Дз
     */
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi!");
            String userAnswer = scanner.nextLine();
        for (;;) {
            System.out.println("Do you like our service? Write: yes or no");
            userAnswer = scanner.nextLine();
            switch (userAnswer) {
                case "yes", "Yes", "YES" -> {
                    System.out.println("Thank you for for your positive answer!");
                    return;
                }
                case "no", "No", "NO" -> {
                    System.out.println("Wrong answer. Thank you!");
                    return;
                }
                default -> System.out.println("Only yes you can choose)");
            }
        }
    }
}
