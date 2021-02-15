package lesson5.homework;

import java.util.Scanner;


public class Bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nПривет! Я умею рассчитать индекс массы тела! \n" +
                "Чтобы узнать свой ИМТ следуй простым инструкциям ниже) \n" +
                "\nВведи 1 и мы начнем!\n");
        String userAnswer = scanner.nextLine();
        switch (userAnswer) {
            case "1" :
                System.out.println("Введи свой рост в метрах: ");
                Double Height = scanner.nextDouble();

                System.out.println("Введи вес в килограммах: ");
                Double Weight = scanner.nextDouble();

                Double bodyMassIntex = Weight / (Height * Height);
                System.out.println("Ваш ИМТ = " + bodyMassIntex);

                if (bodyMassIntex > 12 && bodyMassIntex <= 16) {
                    System.out.println("\nУ тебя выраженный дефицит массы тела, опасный для здоровья!");
                    return;
                }
                if (bodyMassIntex > 16 && bodyMassIntex < 18.5) {
                    System.out.println("\nУ тебя недостаточная масса тела (дефицит), пришло время кушать шоколадку)");
                    return;
                }
                if (bodyMassIntex > 18.5 && bodyMassIntex < 24) {
                    System.out.println("\nМолодец, так держать! У тебя нормальная масса тела");
                    return;
                }
                if (bodyMassIntex > 24 && bodyMassIntex < 30) {
                    System.out.println("\nУ тебя избыточная масса тела (предожирение), время пересмотреть свой рацион!");
                    return;
                }
                if (bodyMassIntex > 30 && bodyMassIntex < 35) {
                    System.out.println("\nОжирение I степени, пора звонить диетологу");
                    return;
                }
                if (bodyMassIntex > 35 && bodyMassIntex < 40) {
                    System.out.println("\nОжирение II степени, время бить тревогу и бежать к врачу!");
                    return;
                }
                if (bodyMassIntex > 40 && bodyMassIntex < 60) {
                    System.out.println("\nОжирение III степени, это может быть опасно для здоровья, беги к доктору!");
                    return;
                } else {
                    System.out.println("Что-то пошло не так(");
                }
            default:
                System.out.println("Нет, так нет(");

        }
    }
}

