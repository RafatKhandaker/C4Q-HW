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

        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"Hello " + name + ", You are in play date with 3 contestants!              **************************************************************************");
        printDelay(1,"You will ask each contestant one question per round..........  *****                                        __.-\"..--,__");
        printDelay(1,"At the end of each round, You will eliminate one contestant!   *****                               __..---\"  | _|    \"-_\\");
        printDelay(1,"                                                               *****                        __.---\"          | V|::.-\"-._D");
        printDelay(1,"                                                               *****                   _--\"\".-.._   ,,::::::'\"\\/\"\"'-:-:/");
        printDelay(1,"                                                               *****              _.-\"\"::_:_:::::'-8b---\"            \"'");
        printDelay(1,"          ARE YOU READY TO PLAY DATE ?                         *****           .-/  ::::<  |\\::::::\"\\");
        printDelay(1,"            (1) Enter 1 to continue                            *****           \\/:::/::::'\\\\ |:::b::\\");
        printDelay(1,"                                                               *****           /|::/:::/::::-::b:%b:\\|");
        printDelay(1,"                                                               *****            \\/::::d:|8:::b:\"%%%%%\\");
        printDelay(1,"                                                               *****            |\\:b:dP:d.:::%%%%%\"\"\"-,");
        printDelay(1,"                                                               *****             \\:\\.V-/ _\\b%P_   /  .-._");
        printDelay(1,"                                                               *****             '|T\\   \"%j d:::--\\.(    \"-.");
        printDelay(1,"                                                               *****             ::d<   -\" d%|:::do%P\"-:.   \"-,");
        printDelay(1,"                                                               *****             |:I _    /%%%o::o8P    \"\\.    \"\\");
        printDelay(1,"                                                               *****              \\8b     d%%%%%%P\"\"-._ _ \\::.    \\");
        printDelay(1,"                                                               *****              \\%%8  _./Y%%P/      .::'-oMMo    )");
        printDelay(1,"                                                               *****                H\"'|V  |  A:::...:odMMMMMM(  ./");
        printDelay(1,"                                                               *****                H /_.--\"JMMMMbo:d##########b/");
        printDelay(1,"                                                               *****             .-'o      dMMMMMMMMMMMMMMP\"\"");
        printDelay(1,"                                                               *****           /\" /       YMMMMMMMMM|");
        printDelay(1,"                                                               *****         /   .   .    \"MMMMMMMM/");
        printDelay(1,"                                                               *****         :..::..:::..  MMMMMMM:|");
        printDelay(1,"                                                               *****         \\:/ \\::::::::JMMMP\":/");
        printDelay(1,"                                                               *****           :Ao ':__.-'MMMP:::Y");

        int start1 = Scan();
        clearScreen();
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"Introducing Contestant number 1!                               *****");
        printDelay(1,"                                                               *****                  /////'");
        printDelay(1," Contestant number 1 is a hard head, he grew up in the mean    *****                 '  # o");
        printDelay(1," Streets of crooklyn. He's been through a lot of               *****                 C   - |");
        printDelay(1," difficult situations that forced him to use his Brawns,       *****    ___          '  =__'        ___");
        printDelay(1," Instead of his Brain. Getting into plenty of street fights    *****   (` _ \\_       |   |        _/  ')");
        printDelay(1," With hardened criminals in the past; in the back of empty     *****    \\  (__\\  ,---- _ |----.  /__)- |");
        printDelay(1," Lots, back alleys, city project basements. Standing 6 ft tall *****     \\__  ( (           /  ) )  __/");
        printDelay(1," weighing in at 175 lbs                                        *****       |_X_\\/ \\.   #  _.|  \\/_X_|");
        printDelay(1,"                                                               *****         |  \\ /(   /    /\\ /  |");
        printDelay(1,"                                                               *****          \\ /  (  ,    /  \\ _/");
        printDelay(1," Here is what he has to say:                                   *****               /______/");
        printDelay(1,"                                                               *****              [:::::::]");
        printDelay(1," --> Ey, Yo ma, I think you beautiful!                         *****             /*%*%*%*%*\\");
        printDelay(1,"     Damn Girl ! Just look at you.                             *****             >%*%#%*%*%|");
        printDelay(1,"     I'd give up all my non-sense                              *****            /%*%*#*%*%*\\");
        printDelay(1,"     Just to be with you.                                      *****           ######^######  b'ger");
        printDelay(1,"                                                               *****");
        printDelay(1,"     I think the most attractive  thing about you is:          *****");
        printDelay(1,"     Your "+ feature + ", all of it !                          *****");
        printDelay(1,"                                                               *****");
        printDelay(1,"                                                               *****");
        printDelay(1,"     I wish I can take back everything in my past              *****");
        printDelay(1,"     Just to be a better man.                                  *****");
        printDelay(1,"     Enter a Value to Continue:....                            *****");

        String start2 = Read();
        clearScreen();

        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"Introducing Contestant number 2!                               *****");
        printDelay(1,"                                                               *****            ,--'.::::::.`-._");
        printDelay(1,"      Contestant number 2 is a successful Engineer             *****           |..::::::::::::..\\");
        printDelay(1,"      He graduated out of Albert Einstein College              *****          |.\\\\.:::::::-;:::::|");
        printDelay(1,"      Institute of Technology                                  *****          |:\\:.::::::/  \\::::|");
        printDelay(1,"      He Sacrificed most of his life to  dedicated himself     *****          || `------'   _|:::|");
        printDelay(1,"      to his work and hasn't had a lot of time to have fun.    *****          ||            `;:::|");
        printDelay(1,"      He desire to meet a modest Woman, who would              *****          |' ====  ====  |-::|");
        printDelay(1,"      one day, make a fine lady and amazing mother.            *****          |  ___   ____  |O):|");
        printDelay(1,"                                                               *****          |  ` |   `    |/::'");
        printDelay(1,"                                                               *****          |    '        |::|");
        printDelay(1," Here is what he has to say:                                   *****          .    v        |:/");
        printDelay(1,"                                                               *****          |             ||");
        printDelay(1," --> I'm looking for someone to                                *****          |   ___       ||");
        printDelay(1,"     fulfill my life with.                                     ***** |         \\   --    _/ |");
        printDelay(1,"     I dated many woman, couldn't really find                  ***** |          \\_____.-' __/-.");
        printDelay(1,"     what is right for me.                                     *****            _|      _/|::.\\.::-._");
        printDelay(1,"                                                               *****       _,--/:|\\_  _/  |.::.|.:::::-._");
        printDelay(1,"     I'm busy most of the time                                 *****   ___/::./:.|_ \\/| __|.::.|.:.:::::::-._");
        printDelay(1,"     but I always dream't to travel the world                  *****--::::::./::.88b|||d888.:::.|.:::::::::::\\");
        printDelay(1,"     with someone special.                                     *****|;:::::::.|.::.8888|88888.:::.|.::::::::::::");
        printDelay(1,"                                                               *****|;:::::::.|.::.888'|`888'.:::.|.::::::/.::::");
        printDelay(1,"     That person is very hard to find.                         *****|;:::::::.|.::.|  |||  |.::::.|.:::::|.:::::");
        printDelay(1,"                                                               *****-.__`::::.|.. .|  |||  |. . .|.::::::|.:::::");
        printDelay(1,"     (1) Enter a Value to Continue:....                            *****./..`--.`.:|.::.| ||| |.::::.|.::::::|.:::::");

        String start3 = Read();
        clearScreen();

        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"*******************************************************************************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"                                                               ****************************************************************");
        printDelay(1,"Introducing Contestant number 3!                               *****");
        printDelay(1,"                                                               *****                         ..sSs$$$$$$b.                                      ");
        printDelay(1,"      Contestant number 3 is a student learning Computer       *****                       .$$$$$$$$$$$$$$$.");
        printDelay(1,"      Science, He works to pay his bills. He is realistic      *****                    .$$$$$$$$$$$$$$$$$$$$$b");
        printDelay(1,"      about life, while working towards a better future.       *****                    .$$$$$$$$$$$$$$$$$$$$$");
        printDelay(1,"      He has a positive mindset and pleasant to be around.     *****                    .$$$$$$$$$$$$$$$$$$$$$");
        printDelay(1,"      He has many interests and is pretty talented in          *****                 $$$$$$$$$$$$$$$$$S'   `$$$$                                 ");
        printDelay(1,"      surprisingly, many activities.                           *****                 $$$$$$$$$$$$$$S'        $$$                                 ");
        printDelay(1,"                                                               *****                 $$$$$$$$$$$$$$S'        $$$                                 ");
        printDelay(1,"                                                               *****                 `$$$$$$$$$$$$$           `$$$.                              ");
        printDelay(1,"                                                               *****                   `$$$$$$$$$'       .s$$$ $$ $                              ");
        printDelay(1," Here is what he has to say:                                   *****                     $$$$$$$$$.sSs .s$$s\"   s s                              ");
        printDelay(1,"                                                               *****                     $$$$$$$$$.sSs .s$$s\"   s s                              ");
        printDelay(1," --> I'm Optomistic but I don't like to dwindle                *****                      `$$$$$$$$$$$s          $                               ");
        printDelay(1,"     on missed opportunity.                                    *****                        $$$$$$$$$$$.    \",                                   ");
        printDelay(1,"     I let things come, I let things go.                       *****                        `$$$$$$$$$$sS$                                       ");
        printDelay(1,"     I believe whatever is right for me, will stay             *****        s$$$.            `$$$$$$$$$$$$.s\"'   .$.                             ");
        printDelay(1,"                                                               *****        $$$$$.              `$$$$$$$$$$.    .$$$Ss.s$s.                      ");
        printDelay(1,"     Come with me, my darling                                  *****         $$$$$.              `$$$$$$$$$P   .$$$$$$$$$$$$.                    ");
        printDelay(1,"     Lets do the un-expected                                   *****         $$$$$$.               `$$$$$$$' .$$$$$$$$$$$$$$$$.                  ");
        printDelay(1,"     live life on the edge                                     *****         `$$$$$$.                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s.          ");
        printDelay(1,"                                                               *****           $$$$$$.                `$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$s.      ");
        printDelay(1,"     Come share your world with mine....                       *****         .s$$$$$$$.                 `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.    ");
        printDelay(1,"                                                               *****         s  $$$$$$$.                .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.   ");
        printDelay(1,"     (1) Enter a Value to Continue:....                        *****         `$$$$$$$$$$.             .$$$' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.  ");

        String start4 = Read();
        clearScreen();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        lineBreak("");
        printDelay(2,"                                                     Choose One contestant to Eliminate !");
        lineBreak("");
        printDelay(2,"                                                                 Who will it Be?");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        lineBreak("");
        printDelay(2,"                                           | (1) Contestant 1 | (2) Contestant 2 | (3) Contestant 3 |   ");
        lineBreak("");
        lineBreak("");
        // Space after the the prompt
            for(int i = 0 ; i < 15 ; i++){
                System.out.println("");
             }
        System.out.println(" Enter 1, 2 , 3 to continue: ");
        int eliminate1 = Scan();

        clearScreen();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        lineBreak("");
        printDelay(2,"                                              Ask the Remaining Contestants one question!");
        lineBreak("");
        printDelay(2,"                                                                 ");
        System.out.println("        (1) If we went out on a date, where would you take me? ");
        System.out.println("        (2) If my computer was having issues connecting to the internet, how would you help me?");
        System.out.println("        (3) If we were stranded on an island, How would we get out?");
        lineBreak("");
        printDelay(2,"                                                          | (1)  | (2) | (3) |   ");
        System.out.println("");
        System.out.println("                                                        Please Enter a value ! ");
        lineBreak("");
        lineBreak("");
        // Space after the the prompt
        for(int i = 0 ; i < 15 ; i++){
            System.out.println("");
        }
      /*  String contestant1 [] = {"I would take you everywhere you can possibly dream", "Well first, I would have to plug my ethernet into your port to check our connection. \n I think you would need to get your ports flipped. Let me put you on the DHCP, \nauthenticate a new address. If not, How 'bout you leave me your number so we can escalate the issue", "We can get out the same way we came in, baby.. the same boat we came in.\n I would rip out tree branches and build a canoe so we can escape"};
        if(eliminate1 == 1){
            System.out.println(contestant1[]);

        }else if(eliminate1 == 2){

        }else if(eliminate1 == 3){} */


    }




}
