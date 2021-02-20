package lesson6.homework;
import java.util.Scanner;
public class Task {
public static final String Yellow = "\u001B[33m";

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
        // write your code here
        System.out.println(Yellow + "Доброго дня. Раді вітати Вас на сайті Технологічного бюро. Як я можу до Вас звертатись?");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        System.out.println(userAnswer + ", якщо Вам необхідна консультація з проектування натисність - 1, ");
        System.out.println("якщо Вас цікавить вартість проектних робіт натисніть  - 2.");
        Scanner scannerProject = new Scanner(System.in);
        String menuMain = scannerProject.nextLine();
        switch (menuMain) {
            case "1":
                System.out.println("Якщо, " + userAnswer + ", плануєте проектувати промислові обєкти натисніть - 3, громадські будівлі - 4");
                Scanner scannerProject1 = new Scanner(System.in);
                String menuProject = scannerProject1.nextLine();
                                 switch (menuProject) {
                                 case "3": System.out.println(userAnswer + ", зателефонуйте за номером +38 067 365 11 11. Дякуємо за увагу!" );
                                 return;

                                 case "4": System.out.println(userAnswer + ", зателефонуйте за номером +38 067 365 11 12. Дякуємо за увагу!");
                                 break;
                                 }
            case "2":
                System.out.println(userAnswer + ", зателефонуйте за номером +38 067 369 96 69. Наш спеціаліст Вас проконсультує. Дякуємо за увагу!");
                break;

            default:
                System.out.println("Перепрошуємо, ми не спеціалізуємось на цьому. Але можемо порекомендувати колег, якщо Ви зателефонуєте по номеру +38 067 369 69 69");
       }
    }
}
