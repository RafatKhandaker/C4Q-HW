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

    public static void clearScreen(){
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("\n \n \n \n \n");
        }
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
          int activity = Scan();

        clearScreen();

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
        printDelay(2,"            (1) Enter 1 to continue                            *****           \\/:::/::::'\\\\ |:::b::\\");
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

        int start1 = Scan();
        clearScreen();
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"Introducing Contestant number 1!                               *****");
        printDelay(2,"                                                               *****                  /////'");
        printDelay(2," Contestant number 1 is a hard head, he grew up in the mean    *****                 '  # o");
        printDelay(2," Streets of crooklyn. He's been through a lot of               *****                 C   - |");
        printDelay(2," difficult situations that forced him to use his Brawns,       *****    ___          '  =__'        ___");
        printDelay(2," Instead of his Brain. Getting into plenty of street fights    *****   (` _ \\_       |   |        _/  ')");
        printDelay(2," With hardened criminals in the past; in the back of empty     *****    \\  (__\\  ,---- _ |----.  /__)- |");
        printDelay(2," Lots, back alleys, city project basements. Standing 6 ft tall *****     \\__  ( (           /  ) )  __/");
        printDelay(2," weighing in at 175 lbs                                        *****       |_X_\\/ \\.   #  _.|  \\/_X_|");
        printDelay(2,"                                                               *****         |  \\ /(   /    /\\ /  |");
        printDelay(2,"                                                               *****          \\ /  (  ,    /  \\ _/");
        printDelay(2," Here is what he has to say:                                   *****               /______/");
        printDelay(2,"                                                               *****              [:::::::]");
        printDelay(2," --> Ey, Yo ma, I think you beautiful!                         *****             /*%*%*%*%*\\");
        printDelay(2,"     Damn Girl ! Just look at you.                             *****             >%*%#%*%*%|");
        printDelay(2,"     I'd give up all my non-sense                              *****            /%*%*#*%*%*\\");
        printDelay(2,"     Just to be with you.                                      *****           ######^######  b'ger");
        printDelay(2,"                                                               *****");
        printDelay(2,"     I think the most attractive  thing about you is:          *****");
        printDelay(2,"     Your "+ feature + ", all of it !                          *****");
        printDelay(2,"                                                               *****");
        printDelay(2,"                                                               *****");
        printDelay(2,"     I wish I can take back everything in my past              *****");
        printDelay(2,"     Just to be a better man.                                  *****");
        printDelay(2,"     Enter a Value to Continue:....                            *****");

        String start2 = Read();
        clearScreen();

        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"Introducing Contestant number 2!                               *****");
        printDelay(2,"                                                               *****            ,--'.::::::.`-._");
        printDelay(2,"      Contestant number 2 is a successful Engineer             *****           |..::::::::::::..\\");
        printDelay(2,"      He graduated out of Albert Einstein College              *****          |.\\\\.:::::::-;:::::|");
        printDelay(2,"      Institute of Technology                                  *****          |:\\:.::::::/  \\::::|");
        printDelay(2,"      He Sacrificed most of his life to  dedicated himself     *****          || `------'   _|:::|");
        printDelay(2,"      to his work and hasn't had a lot of time to have fun.    *****          ||            `;:::|");
        printDelay(2,"      He desire to meet a modest Woman, who would              *****          |' ====  ====  |-::|");
        printDelay(2,"      one day, make a fine lady and amazing mother.            *****          |  ___   ____  |O):|");
        printDelay(2,"                                                               *****          |  ` |   `    |/::'");
        printDelay(2,"                                                               *****          |    '        |::|");
        printDelay(2," Here is what he has to say:                                   *****          .    v        |:/");
        printDelay(2,"                                                               *****          |             ||");
        printDelay(2," --> I'm looking for someone to                                *****          |   ___       ||");
        printDelay(2,"     fulfill my life with.                                     ***** |         \\   --    _/ |");
        printDelay(2,"     I dated many woman, couldn't really find                  ***** |          \\_____.-' __/-.");
        printDelay(2,"     what is right for me.                                     *****            _|      _/|::.\\.::-._");
        printDelay(2,"                                                               *****       _,--/:|\\_  _/  |.::.|.:::::-._");
        printDelay(2,"     I'm busy most of the time                                 *****   ___/::./:.|_ \\/| __|.::.|.:.:::::::-._");
        printDelay(2,"     but I always dream't to travel the world                  *****--::::::./::.88b|||d888.:::.|.:::::::::::\\");
        printDelay(2,"     with someone special.                                     *****|;:::::::.|.::.8888|88888.:::.|.::::::::::::");
        printDelay(2,"                                                               *****|;:::::::.|.::.888'|`888'.:::.|.::::::/.::::");
        printDelay(2,"     That person is very hard to find.                         *****|;:::::::.|.::.|  |||  |.::::.|.:::::|.:::::");
        printDelay(2,"                                                               *****-.__`::::.|.. .|  |||  |. . .|.::::::|.:::::");
        printDelay(2,"     (1) Enter a Value to Continue:....                            *****./..`--.`.:|.::.| ||| |.::::.|.::::::|.:::::");

        String start3 = Read();
        clearScreen();

        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"*******************************************************************************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"                                                               ****************************************************************");
        printDelay(2,"Introducing Contestant number 3!                               *****");
        printDelay(2,"                                                               *****                         ..sSs$$$$$$b.                                      ");
        printDelay(2,"      Contestant number 3 is a student learning Computer       *****                       .$$$$$$$$$$$$$$$.");
        printDelay(2,"      Science, He works to pay his bills. He is realistic      *****                    .$$$$$$$$$$$$$$$$$$$$$b");
        printDelay(2,"      about life, while working towards a better future.       *****                    .$$$$$$$$$$$$$$$$$$$$$");
        printDelay(2,"      He has a positive mindset and pleasant to be around.     *****                    .$$$$$$$$$$$$$$$$$$$$$");
        printDelay(2,"      He has many interests and is pretty talented in          *****                 $$$$$$$$$$$$$$$$$S'   `$$$$                                 ");
        printDelay(2,"      surprisingly, many activities.                           *****                 $$$$$$$$$$$$$$S'        $$$                                 ");
        printDelay(2,"                                                               *****                 $$$$$$$$$$$$$$S'        $$$                                 ");
        printDelay(2,"                                                               *****                 `$$$$$$$$$$$$$           `$$$.                              ");
        printDelay(2,"                                                               *****                   `$$$$$$$$$'       .s$$$ $$ $                              ");
        printDelay(2," Here is what he has to say:                                   *****                     $$$$$$$$$.sSs .s$$s\"   s s                              ");
        printDelay(2,"                                                               *****                     $$$$$$$$$.sSs .s$$s\"   s s                              ");
        printDelay(2," --> I'm Optomistic but I don't like to dwindle                *****                      `$$$$$$$$$$$s          $                               ");
        printDelay(2,"     on missed opportunity.                                    *****                        $$$$$$$$$$$.    \",                                   ");
        printDelay(2,"     I let things come, I let things go.                       *****                        `$$$$$$$$$$sS$                                       ");
        printDelay(2,"     I believe whatever is right for me, will stay             *****        s$$$.            `$$$$$$$$$$$$.s\"'   .$.                             ");
        printDelay(2,"                                                               *****        $$$$$.              `$$$$$$$$$$.    .$$$Ss.s$s.                      ");
        printDelay(2,"     Come with me, my darling                                  *****         $$$$$.              `$$$$$$$$$P   .$$$$$$$$$$$$.                    ");
        printDelay(2,"     Lets do the un-expected                                   *****         $$$$$$.               `$$$$$$$' .$$$$$$$$$$$$$$$$.                  ");
        printDelay(2,"     live life on the edge                                     *****         `$$$$$$.                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s.          ");
        printDelay(2,"                                                               *****           $$$$$$.                `$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$s.      ");
        printDelay(2,"     Come share your world with mine....                       *****         .s$$$$$$$.                 `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.    ");
        printDelay(2,"                                                               *****         s  $$$$$$$.                .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.   ");
        printDelay(2,"     (1) Enter a Value to Continue:....                        *****         `$$$$$$$$$$.             .$$$' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.  ");

        String start4 = Read();
        clearScreen();
    }


}
