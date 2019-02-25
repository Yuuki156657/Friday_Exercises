package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Are you ready for a quiz?");
        String a = in.next();

        System.out.println("Okay, here it comes!\n" +
                "\nQ1) What is the capital of Alaska?\n" +
                "\t1) Melbourne\n" +
                "\t2) Anchorage\n" +
                "\t3) Juneau\n\n> ");
        int b = in.nextInt();

        if (b == 3) {
            int scoa1 = 1;
            System.out.println("That's right!\n" +
                    "\nQ2) Can you store the value \"cat\" in a variable of type int?\n" +
                    "\t1) yes\n" +
                    "\t2) no\n\n> ");
            int c = in.nextInt();

            if (c == 2) {
                int scoa2 = 1;
                System.out.println("That's right!\n" +
                        "\nQ3) What is the result of 9+6/3?\n" +
                        "\t1) 5\n" +
                        "\t2) 11\n" +
                        "\t3) 15/3\n\n> ");
                int d = in.nextInt();

            } else {
                int scoa2 = 0;
                System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n" +
                        "\nQ3) What is the result of 9+6/3?\n" +
                        "\t1) 5\n" +
                        "\t2) 11\n" +
                        "\t3) 15/3\n\n> ");
                int d = in.nextInt();
                if (d == 2) {
                    int scoa3 = 1;
                    System.out.println("That's correct!\n\n\n" +
                            "Overall, you got " + (scoa1 + scoa2 + scoa3) + " out of " + 3 + " correct.\n" +
                            "Thanks for playing!");
                }
            }
        } else {
            int scoa1 = 0;
            System.out.println("Sorry, your answer is wrong.\n" +
                    "\nQ2) Can you store the value \"cat\" in a variable of type int?\n" +
                    "\t1) yes\n" +
                    "\t2) no\n\n> ");
            int c = in.nextInt();
        }
    }
}
