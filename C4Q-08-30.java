package nycc4q;

/* Rafat Khandaker - C4Q - Homework Week 1
This program was written with Intelli J  and does not run on Repl.it

   #1                                       */

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        lineBreak("");
        System.out.println("This is example 8 -- Draw-Triangle ");
        lineBreak("");

                drawTriangle();

    
        lineBreak("");
        System.out.println(" Thank you for running my In class exercise  -- Rafat Khandaker :)");
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
   
// This is example 8 for the Triangle-Loop

    public static void drawTriangle() {
        System.out.println("This function will print out a Triangle based on your desired loop size");
        int x = Scanner();
        String triangle = "";

        for (int i = 0; i < x; i++) {

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
        System.out.println("");
    }

}
