package nycc4q;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;


        printDelay(2, "     _ __               ,---.                                        ,---.   ,--.--------.    ,----.                ___      ,----.          .=-.-. ");
        printDelay(2, "  .-`.' ,`.   _.-.    .--.'  \\   ,--.-.  .-,--.         _,..---._  .--.'  \\ /==/,  -   , -\\,-.--` , \\        .-._ .'=.'\\  ,-.--` , \\        /==/_ / ");
        printDelay(2, " /==/, -   \\.-,.'|    \\==\\  \\\\ /==/- / /=/_ /         /==/,   -  \\ \\==\\/\\  \\ \\==\\.-.  - ,-./==|-  _.-`       /==/ \\ |==|  ||==|-  _.-`       |==|, |  ");
        printDelay(2, " /==/, -   \\.-,.'|    \\==\\-/\\ \\ /==/- / /=/_ /        /==/,   -  \\ \\==\\-/\\ \\\\==\\.-.  - ,-./==|-  _.-`       /==/ \\|==|  ||==|-  _.-`       |==|, |  ");
        printDelay(2, "|==| , '=',|==|- |    \\==\\,   - \\\\==\\  \\/ -/          |==|  .=.   |\\==\\,   - \\    \\==\\_ \\/==/_ ,    /       |==|  \\/  , /==/_ ,    /       /==/. /  ");
        printDelay(2, "|==|-  '..'|==|, |    /==/ -   ,| |==|  ,_/           |==|,|   | -|/==/ -   ,|    |==|- ||==|    .-'        |==|- ,   _ |==|    .-'        `--`-`   ");
        printDelay(2, "|==|,  |   |==|- `-._/==/-  /\\ - \\\\==\\-, /            |==|  '='   /==/-  /\\ - \\   |==|, ||==|_  ,`-._       |==| _ /\\   |==|_  ,`-._        .=.     ");
        printDelay(2, "/==/ - |   /==/ - , ,|==\\ _.\\=\\.-'/==/._/             |==|-,   _`/\\==\\ _.\\=\\.-'   /==/ -//==/ ,     /       /==/  / / , /==/ ,     /       :=; :    ");
        printDelay(2, "`--`---'   `--`-----' `--`        `--`-`              `-.`.____.'  `--`           `--`--``--`-----``        `--`./  `--``--`-----``         `=`     ");

        lineBreak("");
        System.out.println("Created By Rafat Khandaker -- 09/03/16");
        lineBreak("");
        System.out.println("                                             WELCOME TO PLAY DATE ME");
        lineBreak("");
            enterGame();
            startStory();

        lineBreak("");
        System.out.println("-----------------------------------------------------END OF THE GAME---------------------------------------------------------------");

        printDelay(2, "                                                    ,        ,");
        printDelay(2, "                                                    /(        )`");
        printDelay(2, "                                                    \\ \\___   / |");
        printDelay(2, "                                                   /- _  `-/  '");
        printDelay(2, "                                                  (/\\/ \\ \\   /\\");
        printDelay(2, "                                                 / /   | `    \\");
        printDelay(2, "                                                  O O   ) /    |");
        printDelay(2, "                                                `-^--'`<     '");
        printDelay(2, "                                               (_.)  _  )   /");
        printDelay(2, "                                                  `.___/`    /");
        printDelay(2, "                                                  `-----' /");
        printDelay(2, "                                       <----.     __ / __   \\");
        printDelay(2, "                                       <----|====O)))==) \\) /====");
        printDelay(2, "                                       <----'    `--' `.__,' \\");
        printDelay(2, "                                                    |        |");
        printDelay(2, "                                                     \\       /");
        printDelay(2, "                                               ______( (_  / \\______");
        printDelay(2, "                                             ,'  ,-----'   |        \\");
        printDelay(2, "                                            `--{__________)         \\/ ");
        System.out.println();

        System.out.println("--------------------------------------------------Thank You For Playing-------------------------------------------------------");

        lineBreak("");
    }

    // Text effects and decoration
    public static void printDelay(long delay, String input) {
        try {
            for (char ch : input.toCharArray()) {
                System.out.print(ch);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
        }
        System.out.println();
    }
    public static void lineBreak(String input){
        System.out.println("_________________________________________________________________________________________________________________________________________");
    }
    ////////////////////////////////////////////////////////////////////////////////
    // Useful Methods ///
    public static int Scan(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public static String Read() {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        return x;
    }

    //////////////////////////////////////////////////////////////////////////////////
    public static void enterGame(){
        int enterVal;
        do {
            System.out.println("                                     (1) Start New Game  |   (2) Quit Game  | ");
            System.out.println("Enter Value: ");
            enterVal = Scan();
           // System.out.println(enterVal); // test enterVal

        }while(enterVal != 1 && enterVal != 2); // "==" would compare int !=  --> comparing memory address... vs .equals is comparing primitives.
        printDelay(20, "Loading % ****************************************************************************************************************************");

        return;
    }

    public static void startStory(){
        System.out.println("\n \n ");
        printDelay(2,"Hello, welcome to Date Me!   |");
        printDelay(2,"What is your name: ______?   | ");
        String name = Read();
        printDelay(2,"What is your favorite food between _______:  |");
        System.out.println("(1) CheeseBurger | (2) Pizza | (3) Chicken Wings | (4)  Fish |  (5) Salad ");
        String food = Read();
        printDelay(2,"What is your best feature?   |");
        String feature = Read();
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"Hello " + name + " You are in play date with 3 contestants!               **************************************************************************");
        printDelay(2,"You will ask each contestant one question per round..........  *****");
        printDelay(2,"At the end of each round, You will eliminate one contestant!   *****");
        printDelay(2,"                                                               *****");
        printDelay(2,"                                                               *****");
        printDelay(2,"                                                               *****");
        printDelay(2,"          ARE YOU READY TO PLAY DATE ?                         *****");
        printDelay(2,"");
        printDelay(2,"");
        printDelay(2,"");
        printDelay(2,"");
        printDelay(2,"");
        printDelay(2,"");

    }

}
