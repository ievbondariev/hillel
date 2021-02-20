package lesson6.homework;

import java.util.Scanner;

class Task{


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "Як тебе звати?");

        Scanner scanname = new Scanner(System.in);
        String name = scanname.nextLine();


        System.out.println("Привіт, " + name + "!");

        System.out.println("Якщо хочеш я можу порахувати рік твого народження");

        System.out.println("Якщо тобі цікаво - " + ANSI_GREEN+ "тисни 1," + ANSI_RED +" якщо ні - 0");


        Scanner danet = new Scanner(System.in);
        int yesnope = danet.nextInt();
        int ye  = 1;
        int no = 0;
        if (yesnope==ye) {
            Scanner bro = new Scanner(System.in);
            System.out.println(ANSI_YELLOW + name + "," + " скільки тобі років?");
            Scanner sup = new Scanner(System.in);
            int age = sup.nextInt();
            int year = 2021;
            int yearbirth = year - age;
            int minusyearbirth = --year - age;
            System.out.println("Рік твого народження " + yearbirth + "?");
            System.out.println(ANSI_GREEN+ "Введи 1 щоб сказати ТАК " +ANSI_RED+"або 0 щоб сказати Ні");
            Scanner YN = new Scanner(System.in);
            int otvet = YN.nextInt();
            int yes = 1;
            //int no = 0;
            if (otvet == yes) {
                System.out.println(ANSI_YELLOW+ "Дякую за увагу");
//               return;
            } else {
                System.out.println("Тоді можливо " + minusyearbirth + "?");
                System.out.println(ANSI_GREEN+"Введи 1 щоб сказати ТАК" + ANSI_RED +"або  0 щоб сказати Ні");
                Scanner yepnope = new Scanner(System.in);
                int vidpovid = yepnope.nextInt();
                int yoes = 1;
                //int ono = 0;
                if (vidpovid == yoes) {
                    System.out.println(ANSI_YELLOW+ "Дякую за увагу");
                } else {
                    System.out.println(ANSI_WHITE+ "Не видумуй, я все прорахував вірно!");}             }


        }if (yesnope==no){

            System.out.println(ANSI_YELLOW + "окок, вмовляти не стану");

        }






        {




            System.out.println(ANSI_YELLOW + "Ще я можу намалювати тобі сердечко, якщо ти скажеш мені скільки буде 2*2" + ANSI_CYAN);

            Scanner dvajdydva = new Scanner(System.in);
            int yaya = dvajdydva.nextInt();
            int y = 4;

            if (yaya==y){

                String heart = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWWWMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMWWX0Oxddoooooddxk0KNWMMMMMMMMMMMMMMMMMMMWNKOkkxdddoooddxO0XWWMMMMMMMMMM\n" +
                        "MMMMMMWN0xoc:::cccccc:;;,,,;cokKWMMMMMMMMMMMMMNKkdllclllloollc:;,,;:lx0NMMMMMMMM\n" +
                        "MMMMWKxl:clooddddddoollc::;,,,,;oONWMMMMMMMWNOoccloddddddddooolc:;;,'',cxXWMMMMM\n" +
                        "MMMXxc:lodddddooooooolllc::;;,,'',l0WMMMMMN0ocloddddoooooooolllcc:;;,,'.':xXMMMM\n" +
                        "MW0l;codddoooooolllllllcc::;;;,,,'';dXWWWXd::odddooooolllllllccc::;;,,'''.'c0WMM\n" +
                        "WO:,coooooooollllllccccc:::;;;,,,''',l0Oxl;:loooooollllllccccc:::;;;,,''''..;OWM\n" +
                        "O:,;clooollllllcccccc::::;;;;,,,,''''';;',;:cllllllllcccccc:::::;;;;,,''''''.:0W\n" +
                        "l',;cclllllccccc::::::;;;;;;,,,,,'''''''',;::cccccccccc::::::;;;;;;,,,,'''''''lX\n" +
                        ",',;::cccccc:::::::;;;;;;;,,,,,,,''''''',,,;;:::cccc:::::::;;;;;;;,,,,,''''''.;O\n" +
                        "''',;;:::::::::;;;;;;;,,,,,,,,,,,'''''''',,,;;;;::::::;;;;;;;;;;,,,,,,,''',,'',x\n" +
                        "''',,;;;;;;;;;;;;;;;,,,,,,,,,,,,,,''''',,,,,,,,;;;;;;;;;;;;;;,,,,,,,,,,'',,,,',x\n" +
                        "'''',,,;;;;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;;;;;,,,,,,,,,,,,,',,,,,';k\n" +
                        ";.''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''''''''''''',,,,,':0\n" +
                        "l''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''''''''............',,,,,oN\n" +
                        "O;''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'''....................'''''':0M\n" +
                        "Nx,''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''......................''''..'xWM\n" +
                        "MXo,'''''''''''''',,,,,,,,,,,,,,,,,,,,,,,,,,''.......................''''..'oNMM\n" +
                        "MMXd,'''''''',,''''',,,,,,,,,,,,,,,,,,,,,,''.......................'''''..'dNMMM\n" +
                        "MMMNk:'''','',,,,,,,,,,,,,,,,,,,,,,,,,'''........................''''''..,kNMMMM\n" +
                        "MMMMW0l,'',,,,,,,,,,,,,,,,,,,,,,,,'''...........................'''''...c0WMMMMM\n" +
                        "MMMMMMNkc,''',,',,,,'''''''''''''.............................'''''...:kNMMMMMMM\n" +
                        "MMMMMMMMXx:'''''''''''''''..................................''''....;xXMMMMMMMMM\n" +
                        "MMMMMMMMMWXx:..............................................''.....:xXWMMMMMMMMMM\n" +
                        "MMMMMMMMMMMWXkc................................................'cONMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMN0o,...........................................;o0WMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMWXkc'.....................................'ckXWMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMW0d;.................................;dKWMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMNOl,...........................,lONMMMMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMWKx:.......................:xXWMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMNOl,.................,oONWWWWWWWWWWWWWWWWWMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKd;.............;o0XXXXXXXXXXXNNNNNNNWWWWWWWWMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx;.........,lk00000000000KKKKXXXXXNNNNNWWWWWMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNx;.....':dxxxxxxxkkkkOOOO00KKKXXXNNNNWWWWMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl...,clloooddxxxkkOO000KKXXNNNNWWWWMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkdxxkkOOO000KKXXXNNNNWWWWWMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";

                for (char c : heart.toCharArray())
                    System.out.print(c);






            }else{
                System.out.println(ANSI_CYAN + "Немає " + ANSI_YELLOW +  "вірної " + ANSI_BLUE + "відповіді " + ANSI_GREEN + "- "+ "немає"+ ANSI_PURPLE +" сердечок!");




            }







        }






    }


}