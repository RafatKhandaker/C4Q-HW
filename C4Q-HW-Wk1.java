package nycc4q;

/* Rafat Khandaker - C4Q - Homework Week 1
This program was written with Intelli J  and does not run on Repl.it

   #1                                       */

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        lineBreak("");
        System.out.println("This is example 1 -- Add-Function: ");
        lineBreak("");

            System.out.println("");

           int a = Scanner();
           int b = Scanner();

                addFunction(a, b);

        lineBreak("");
        System.out.println("This is example 2 --Age-Calculator");
        lineBreak("");

                ageCalculator(a, b);

        lineBreak("");
        System.out.println("This is example 3 --X's and Oh's");
        lineBreak("");

                exesAndOhs();

        lineBreak("");
        System.out.println("This is example 4 -- end with ly");
        lineBreak("");

               endsly();

        lineBreak("");
        System.out.println("This is example 5 -- Chess Board");
        lineBreak("");

            int x = Scanner();
               chessboard(x);

        lineBreak("");
        System.out.println("This is example 6 -- Hungry Hippo");
        lineBreak("");

               hungryHippo();

        lineBreak("");
        System.out.println("This is example 7 -- elide ");
        lineBreak("");

               elide();

        lineBreak("");
        System.out.println("This is example 8 -- Triangle-Loop ");
        lineBreak("");

                triangleLoop();

        lineBreak("");
        System.out.println("This is example 9 -- String-Parameter ");
        lineBreak("");

                countCode();

        lineBreak("");
        System.out.println(" Thank you for running my Homework  -- Rafat Khandaker :)");
        lineBreak("");
    }


    // Predefined method for line decoration

    public static void lineBreak(String line) {

        System.out.println("_____________________________________");

    }


    public static int Wait() {

        System.out.println("press enter to continue");

        Scanner delay = new Scanner(System.in);

        return delay.nextInt();

    }

    public static int Scanner() {

        System.out.println("Please enter input :");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

    public static String Reader() {
        System.out.println("Please enter input: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    //  This is example 1 for the Add-Function

    public static int addFunction(int x, int y) {

        System.out.println("This function will add two numbers: ");

        int result = x + y;

        System.out.println(result);

        return result;
    }
// This is example 2 for the Age-Calculator

    public static int ageCalculator(int x, int y) {

        System.out.println("This function will calculate your age");
        System.out.println("Please enter the year you were born: ");
        x = Scanner();
        System.out.println("Please enter todays year: ");
        y = Scanner();
        int result = y - x;
        int result2 = result - 1;
        System.out.println("You are about " + result2 + " and " + result);
        return y - x;
    }

    // This is example 3 for the Exe's and Oh's method
    public static boolean exesAndOhs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This function will tell you if there are an equal amount of Xs and Os");
        System.out.println("Please enter a string word with: ");
        String phrase = sc.next();
        int x = 0;
        int y = 0;
        boolean result;


        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.toLowerCase().charAt(i) == 'x') {
                x++;
            } else if (phrase.toLowerCase().charAt(i) == 'o') {
                y++;
            }
        }
        if (y == x) {
            result = true;
        } else {
            result = false;
        }

        boolean resultVal = result;
        System.out.println(resultVal);

        return resultVal;

    }
// This is example 4 for the endsly method

    public static boolean endsly() {

        Scanner sc = new Scanner(System.in);
        System.out.println("This function will tell you if the suffix ends with ly of a word");
        String phrase = sc.next();

        int x = phrase.length() - 1; // position of the second to last char
        int y = phrase.length() - 2; // position of the last char
        boolean result;

        if (phrase.toLowerCase().charAt(x) == 'y' && phrase.toLowerCase().charAt(y) == 'l') {
            result = true;
            System.out.println(result + " This string ends with ly");
        } else {
            result = false;
            System.out.println(result + " This string does not end with ly");
        }

        return result;
    }

// This is example 5 for the chessboard method

    public static String chessboard(int size) {
        System.out.println("This function will print out a chessboard: ");

        int j = 0;
        int i = 0;
        String spot = "";

        for (i = 0; i < size; i++) {
            if (i % 2 == 0) {
                spot += " ";
            }
            for (j = 0; j < size; j++) {
                if (j % 2 == 0) {
                    spot += "#";
                } else {
                    spot += " ";
                }
            }
            spot += "\n";
        }
        System.out.println(spot);
        return spot;
    }

    // This is example 6 for the Hungry-Hippo method
    public static void hungryHippo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This Program will determine if the Hippos at the Zoo will eat the food");
        System.out.println("Enter the food that you will feed the Hippo: ");
        String food = sc.next();
        String foodCheck = food.toLowerCase();
        char foodValAt = foodCheck.charAt(0);
        if (foodValAt == 'h') {
            System.out.println("Yum !");
        } else {
            System.out.println("Yuck !");
        }

    }

    // This is example 7 for the string elide return method
    public static void elide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This function will print out a word or statement depending on it's length: ");
        String phrase = sc.nextLine();
        int x = phrase.length() - 1;
        char phraseLastLetter = phrase.charAt(x);
        if (phrase.length() <= 6) {
            System.out.println(phrase);
        } else {
            System.out.println(phrase.substring(0, 2) + "..." + phraseLastLetter);
        }
    }
// This is example 8 for the Triangle-Loop

    public static void triangleLoop() {
        System.out.println("This function will print out a Triangle based on your desired loop size");
        int x = Scanner();
        String triangle = "";

        for (int i = 0; i <= x; i++) {

            System.out.println("");
            int y = 0;
            int w = 0;
            y++;
            while (w != y) {
                triangle += "#";
                System.out.print(triangle);
                w++;
            }
        }

    }

    // This is example 9 For the count-code function
    public static void countCode() {
            int result = 0;
        System.out.println("This function will tell us how many times the string code appears within a string: ");
        System.out.println("Please enter a phrase or string value: ");
        String phrase = Reader();
        System.out.println("Please enter the parameter you want to measure within the string: ");
        String measure = Reader();
            int counter = 0;
            int x = phrase.length() - 1;
            int y = measure.length() - 1;


        for( int i = 0 ; i < measure.length() ; i++) {

            if (phrase.substring(i,y) == measure) {
                y++;
                counter++;
            }else{
                y++;
            }

            y++;
        }

        System.out.println(counter);
    }
}
