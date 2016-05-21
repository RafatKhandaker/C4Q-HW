package nycc4q;

/* Rafat Khandaker - C4Q - Homework Week 1
From problems 1 to 13 // Run through on intellij or Repl
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


            String l = "aaacodebbb";
            String y = "codexxxcode";
            String z = "cozexxcope";

                System.out.println("aaacodebbb");
                countCode(l);
                System.out.println("codexxxcode");
                countCode(y);
                System.out.println("cozexxcope");
                countCode(z);

        lineBreak("");
        System.out.println(" This function will count the vowels there are within a string");
        lineBreak("");

                countVowel();

        lineBreak("");
        System.out.println("This is example 11 - Cut a String at Character");
        lineBreak("");

            cutString();


        lineBreak("");
        System.out.println(" This is example 12 - twelve-days ");
        lineBreak("");

            twelveDays();

        lineBreak("");
        System.out.println(" This is example 13 - nner icescream startup ");
        lineBreak("");

            iceScream();

        lineBreak("");
        System.out.println(" Thank you for running my Homework  -- Rafat Khandaker :)");
        lineBreak("");

<<<<<<< HEAD
=======

>>>>>>> bdd3dc78092440d5962f5412bdcd3436fbf5905d
    }


    // Predefined method for line decoration

    public static void lineBreak(String line) {

        System.out.println("___________________________________________________________________________");

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

        for (int i = 0; i < x; i++) {

<<<<<<< HEAD
            triangle += "#";
            System.out.println(triangle);

        }
    }

// This is example 9 For the count-code function

    /*    public static void countCode() {
            System.out.println("This function will tell us how many times the string code appears within a string: ");
            System.out.println("Please enter a phrase or string value: ");
            String phrase = Reader();
            System.out.println("Please enter the parameter you want to measure within the string: ");
            String measure = Reader();
                int counter = 0;
                int x = phrase.length() - 1;
                int y = measure.length();
                int z = 0;

            for( int i = 0 ; i < phrase.length() ; i++) {
              //  System.out.println(phrase.substring(i,y));
                if(phrase.charAt(i) == measure.charAt(i)) {
                    String check = "";
                    System.out.println(phrase.charAt(i));
                    while(z != measure.length()) {
                        check += phrase.charAt(z);
                        z++;
                        System.out.println(check);
                        if(check == "code"){
                            counter++;
                        }
                    }
                    System.out.println(check);
                    System.out.println(counter);


                }
            }
            System.out.println(counter);
        } */

=======
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

// This is example 9 For the count-code function
>>>>>>> bdd3dc78092440d5962f5412bdcd3436fbf5905d
    public static void countCode() {
        System.out.println("This function will tell us how many times the string code appears within a string: ");
        System.out.println("Please enter a phrase or string value: ");
        String phrase = Reader();
        System.out.println("Please enter the parameter you want to measure within the string: ");
        String measure = Reader();
<<<<<<< HEAD
        int counter = 0;
        int x = phrase.length() - 1;
        int y = measure.length();
        int z = 0;
        int i = 0;
        int c = 0;
        int v = 0;
        while (i != x) {
            while (v != y && i < (phrase.length()-1) ) {

                if (phrase.charAt(i) == measure.charAt(i)) {
                    c++;

                    //   System.out.println(c);

                    System.out.println(measure.charAt(i));
                    System.out.println(phrase.charAt(i));
                    if (c == y) {
                        counter++;
                        System.out.println(counter);

                    }

                } else {
                    c = 0;
                    v = y-1;
                }
                v++;
            }

            v = 0;

            i++;

        }

        System.out.println(counter);
    }


    public static void countCode(String input) {
        int counter = 0;
        int i = 0;
        System.out.println("This code will measure how many times a string appears within a string");
        while (i < input.length()) {
            if (input.toLowerCase().charAt(i) == 'c' && input.toLowerCase().charAt(i + 1) == 'o' && input.toLowerCase().charAt(i + 3) == 'e') {
                counter++;
            }

            i++;
        }
        System.out.println(counter);
    }


    // This is example 10 Count The Vowels Function

    public static void countVowel() {
        int counter = 0;
        int i = 0;
        int j = 0;

        char [] vowel = {'a','e','i','o','u',};
        String input = Reader();
        while (i < input.length()){
            while(j < 5 ) {
                if (input.toLowerCase().charAt(i) == vowel[j]) {
                   counter++;
                }
                j++;
            }
            j=0;
            i++;
        }
=======
            int counter = 0;
            int x = phrase.length() - 1;
            int y = measure.length();

        for( int i = 0 ; i <= phrase.length() ; i++) {
            System.out.println(phrase.substring(i,y));

            if (phrase.substring(i,y) == measure) {
                y++;
               // i++;

                System.out.println(counter);
            }else{
                y++;
                counter++;
            }

            System.out.println(phrase.substring(i,y));
>>>>>>> bdd3dc78092440d5962f5412bdcd3436fbf5905d

        }
        System.out.println(counter);

    }

    public static void cutString() {
        System.out.println("This function will separate a string from a char");
        System.out.println("Please enter a phrase: ");
        String input = Reader();
        System.out.println("Please enter a letter to locate: ");
        Scanner sc = new Scanner(System.in);
        String position = sc.next();
        int l = 0;
        int m = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == position.toLowerCase().charAt(0)) {
                l = m;
                int y = input.length();
                System.out.println(input.substring(i, y));
            }
            // use to terminate the loop
            if (l == m) {
                i = input.length();
            }
        }
    }
// This is example 12 function twelve days of christmas
    public static void twelveDays(){
        String christmasDay = ("On the first day of Christmas, my true love gave to me a partridge in a pear tree.\n" +
                "On the second day of Christmas my true love gave to me two turtle doves\n" +
                "And a partridge in a pear tree.\n" +
                "On the third day of Christmas my true love gave to me three French hens,\n" +
                "Two turtle doves, and a Partridge in a pear tree.\n" +
                "On the fourth day of Christmas my true love gave to me\n" +
                "Four calling birds, three French hens, two turtle doves and a Partridge in a pear tree.\n" +
                "On the fifth day of Christmas my true love gave to me five golden rings,\n" +
                "Four calling birds, three French hens, two turtle doves and a Partridge in a pear tree.\n" +
                "On the sixth day of Christmas my true love gave to me six geese a laying,\n" +
                "Five golden rings, four calling birds, three French hens, two turtle doves\n" +
                "And a Partridge in a pear tree.\n" +
                "On the seventh day of Christmas my true love gave to me seven swans a swimming,\n" +
                "Six geese a laying, five golden rings, four calling birds, three French hens,\n" +
                "Two turtle doves and a Partridge in a pear tree.\n" +
                "On the eighth day of Christmas my true love gave to me eight maids a milking,\n" +
                "Seven swans a swimming, six geese a laying, five golden rings, four calling birds,\n" +
                "Three French hens, two turtle doves and a Partridge in a pear tree.\n" +
                "On the ninth day of Christmas my true love gave to me nine ladies dancing,\n" +
                "Eight maids a milking, seven swans a swimming, six geese a laying, five golden rings,\n" +
                "Four calling birds, three French hens, two turtle doves and a Partridge in a pear tree.\n" +
                "On the tenth day of Christmas my true love gave to me ten lords a leaping,\n" +
                "Nine ladies dancing, eight maids a milking, seven swans a swimming, six geese a laying,\n" +
                "Five golden rings, four calling birds, three French hens, two turtle doves\n" +
                "And a Partridge in a pear tree.\n" +
                "On the eleventh day of Christmas my true love gave to me eleven pipers piping,\n" +
                "Ten lords a leaping nine ladies dancing, eight maids a milking, seven swans a swimming,\n" +
                "Six geese a laying, five golden rings, four calling birds, three French hens,\n" +
                "Two turtle doves and a Partridge in a pear tree.\n" +
                "On the twelfth day of Christmas my true love gave to me twelve drummers drumming,\n" +
                "Eleven pipers piping, ten lords a leaping nine ladies dancing, eight maids a milking,\n" +
                "Seven swans a swimming, six geese a laying, five golden rings, four calling birds,\n" +
                "Three French hens, two turtle doves and a Partridge in a pear tree.");
        System.out.println(christmasDay);
    }

    // This is example 13 of the icescream service function

    public static void iceScream(){
        double totalPrice = 0;
        System.out.println("This function will aid in your icescream selection and order ");
        System.out.println("What is your name?: ");
        String name = Reader();
        System.out.println("Okay " + name + ", which flavor of ice scream would you like: ");
        System.out.println( "(1) -> Vanilla, (2) -> Chocolate, (3) -> Strawberry");
        int iceVal = Scanner();
        int topCount = 0;
            if(iceVal == 1 || iceVal == 2 || iceVal == 3){
                totalPrice += 2.33;
                System.out.println("Would you like chocolate chips?: (y or n) ");
                String top1 = Reader();
                    if(top1.toLowerCase().charAt(0) == 'y'){
                        totalPrice += 0.33;
                        topCount++;
                    }else{}
                System.out.println("Would you like bannanas?: (y or n)");
                String top2 = Reader();
                    if(top2.toLowerCase().charAt(0) == 'y'){
                        totalPrice += 0.33;
                        topCount++;
                    }else{}
                System.out.println("Would you like gummy bears?: (y or n)");
                String top3 = Reader();
                    if(top3.toLowerCase().charAt(0) == 'y'){
                        totalPrice += 0.33;
                        topCount++;
                    }else{}
                }
            double randTime = Math.random()*60;
            randTime =  Math.floor(randTime);

            switch(iceVal){
                case 1:
                    System.out.println("Okay " + name + ", a Vanilla ice cream with " + topCount + " toppings. Your total is $" + totalPrice + "\nand your ice cream will arrive in " + randTime + " minutes.");
                    break;
                case 2:
                    System.out.println("Okay " + name + ", a Chocolate ice cream with " + topCount + " toppings. Your total is $" + totalPrice + "\nand your ice cream will arrive in " + randTime + " minutes.");

                    break;
                case 3:
                    System.out.println("Okay " + name + ", a Strawberry ice cream with " + topCount + " toppings. Your total is $" + totalPrice + "\nand your ice cream will arrive in " + randTime + " minutes.");

                    break;
                default:
                    System.out.println("Have a nice day!");
                    break;
            }

    }

}



