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

public static void tweetScan(String text) {
        String mentions = "";
        String hashtags = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '@') {
                while ((text.charAt(i) != ' ') && i != text.length() - 1) {
                    mentions += text.charAt(i);
                    i++;
                }
                mentions += ' ';
            } else if (text.charAt(i) == '#') {
                while ((text.charAt(i) != ' ') && i != text.length() - 1) {
                    hashtags += text.charAt(i);
                    i++;
                }
                hashtags += ' ';
            } else {
                i++;
            }
        }

        System.out.println("Mentions: " + mentions + "\n" + "Hashtags: " + hashtags);

    }

    public static void twitterMentionsArray(String tweet) {
        String[] words = tweet.split(" ");
        String mentions = "Mentions: ";
        String hashtags = "Hashtags: ";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == '#') {
                hashtags += word + " ";
            } else if (word.charAt(0) == '@') {
                mentions += word + " ";
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);
    }

    public static void getHashTags(String tweet) {
        Scanner scanner = new Scanner(tweet);
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println(word);
        }
    }

    public static void twitterMentions(String tweet) {
        String mentions = "";
        String hastags = "";

        for (int i = 0; i < tweet.length(); i++) {
            char c = tweet.charAt(i);
            switch (c) {
                case '@':
                    System.out.println("We found an #");
//                    int j=i;
                    while (c != ' ' && i < tweet.length()) {
                        mentions += tweet.charAt(i);
                        i++;
                        if (tweet.charAt(i) == ' ') {
                            break;
                        }

                    }
                    break;
                case '#':
                    System.out.println("We found a #");
                    while (c != ' ' && i < tweet.length()) {
                        hastags += tweet.charAt(i);
                        i++;
                        if (tweet.charAt(i) == ' ') {
                            break;
                        }
                    }

                default://fixme
            }
        }
        System.out.println(mentions);
    
}
