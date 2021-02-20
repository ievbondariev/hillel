

import java.util.Scanner;

public class Task {

    /**
     * Создайте своего собственного чат бота) Алгоритм прост, спрашиваете у пользователя команду,
     * и делаете то что он просит) Команды могут быть любые, например:
     * Посчитать площадь прямоугольника или треугольника, посчитать суму чисел, высчитать среднее арифметическое чисел,
     * просто поприветствовать кого-то или даже нарисовать единорога в консоли с помощью чёрточек и ноликов, что угодно,
     * включайте фантазию))))
     * <p>
     * PS. Чем оригинальнее и необычнее тем круче, жду ваших свершений) Ну и + доделать прошлое Дз
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm Tomas - your personal chat bot! How can I help you?");
        String userAnswer;
        while (true) {
            userAnswer = scanner.nextLine();
            switch (userAnswer) {
                case "Exit":
                case "exit":
                case "Quit":
                case "quit":
                case "Q":
                case "q":
                    System.out.println("By by, see you soon!");
                    return;
                case "Triangle":
                case "triangle":
                    System.out.println("Enter the value of the sides of the triangle:");
                    System.out.println("Enter A:");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter B:");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter C:");
                    int c = Integer.parseInt(scanner.nextLine());
                    int p = ((a + b + c) / 2);
                    int resultTriangle = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println(resultTriangle);
                    System.out.println("How can I help you?");
                    break;
                case "Rectangle":
                case "rectangle":
                    System.out.println("Enter the value of the sides of the rectangle:");
                    System.out.println("Enter A:");
                    int a1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter B:");
                    int b1 = Integer.parseInt(scanner.nextLine());
                    int resultRectangle = a1 * b1;
                    System.out.println(resultRectangle);
                    System.out.println("How can I help you?");
                    break;
                default:
                    System.out.println("Are u crazy?");


            }
        }

    }
}

