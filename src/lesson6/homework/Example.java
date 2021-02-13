package lesson6.homework;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm Tomas - your personal chat bot! How can I help you?");
        String userAnswer = scanner.nextLine();
        for (;;) {
            System.out.println("How can I help you?");
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
                case "Say hi":
                case "say hi":
                    System.out.println("Hi!");
                    break;

                default:
                    System.out.println("Sorry, I don't understand you :(");
            }
        }
    }
}
