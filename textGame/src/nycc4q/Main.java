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
            System.out.println("Enter a value to continue: ");
            int end = Scan();
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
        printDelay(2,"What is your favorite cheat meal between _______:  |");
        System.out.println("(1) CheeseBurger | (2) Pizza | (3) Chicken Wings | (4)  Fish |  (5) Salad ");
        String food = Read();
        printDelay(2,"What is your best feature?   |");
        String feature = Read();
        printDelay(2,"What do you find more enjoyable?: ");
        System.out.println("(1) Dinner Cruise in the NYC harbor, late evening");
        System.out.println("(2) Join a quick getaway tour group to see a new city");
        System.out.println("(3) Go skiing and stay at a nice cabin in the winter, with indoor hot springs ");
        System.out.println("(4) Keep it simple, Casual Movie and Dinner");
        System.out.println("(5) kayaking in a lake somewhere ");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"Hello " + name + ", You are in play date with 3 contestants!              **************************************************************************");
        printDelay(2,"You will ask each contestant one question per round..........  *****                                        __.-\"..--,__");
        printDelay(2,"At the end of each round, You will eliminate one contestant!   *****                               __..---\"  | _|    \"-_\\");
        printDelay(2,"                                                               *****                        __.---\"          | V|::.-\"-._D");
        printDelay(2,"                                                               *****                   _--\"\".-.._   ,,::::::'\"\\/\"\"'-:-:/");
        printDelay(2,"                                                               *****              _.-\"\"::_:_:::::'-8b---\"            \"'");
        printDelay(2,"          ARE YOU READY TO PLAY DATE ?                         *****           .-/  ::::<  |\\::::::\"\\");
        printDelay(2,"                                                               *****           \\/:::/::::'\\\\ |:::b::\\");
        printDelay(2,"                                                               *****           /|::/:::/::::-::b:%b:\\|");
        printDelay(2,"                                                               *****            \\/::::d:|8:::b:\"%%%%%\\");
        printDelay(2,"                                                               *****            |\\:b:dP:d.:::%%%%%\"\"\"-,");
        printDelay(2,"                                                               *****             \\:\\.V-/ _\\b%P_   /  .-._");
        printDelay(2,"                                                               *****             '|T\\   \"%j d:::--\\.(    \"-.");
        printDelay(2,"                                                               *****             ::d<   -\" d%|:::do%P\"-:.   \"-,");
        printDelay(2,"                                                               *****             |:I _    /%%%o::o8P    \"\\.    \"\\");
        printDelay(2,"                                                               *****              \\8b     d%%%%%%P\"\"-._ _ \\::.    \\");
        printDelay(2,"                                                               *****              \\%%8  _./Y%%P/      .::'-oMMo    )");
        printDelay(2,"                                                               *****                H\"'|V  |  A:::...:odMMMMMM(  ./");
        printDelay(2,"                                                               *****                H /_.--\"JMMMMbo:d##########b/");
        printDelay(2,"                                                               *****             .-'o      dMMMMMMMMMMMMMMP\"\"");
        printDelay(2,"                                                               *****           /\" /       YMMMMMMMMM|");
        printDelay(2,"                                                               *****         /   .   .    \"MMMMMMMM/");
        printDelay(2,"                                                               *****         :..::..:::..  MMMMMMM:|");
        printDelay(2,"                                                               *****         \\:/ \\::::::::JMMMP\":/");
        printDelay(2,"                                                               *****           :Ao ':__.-'MMMP:::Y");
        String start1 = Read();



    }


}
