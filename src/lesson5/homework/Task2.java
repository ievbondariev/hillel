package lesson5.homework;

import java.util.Scanner;

public class Task2 {

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
     * или слово NO в противном случае.
     *
     * Формат входных данных:
     * Вводится натуральное число.
     *
     * Формат выходных данных:
     * Выведите ответ на задачу.
     *
     * Sample Input 1:
     * 1
     * Sample Output 1:
     * YES
     *
     * Sample Input 2:
     * 2
     * Sample Output 2:
     * YES
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vvod = scanner.nextInt();

        while (vvod !=1 && vvod %2 ==0){
            vvod=vvod/2;
        }

        System.out.println(vvod==1? "yes" : "no");   // вывод через тернарный, так меньше писанины

//        if (vvod==1){                              //или через "if /else"
//            System.out.println("Yep");
//        }else {
//            System.out.println("Nope");
//        }



    }
}
