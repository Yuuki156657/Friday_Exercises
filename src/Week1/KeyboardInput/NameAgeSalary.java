package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String line1 = Scanner1.nextLine();
        if (line1.equals("Dennis")) {
            Scanner Scanner2 = new Scanner(System.in);
            System.out.println("Hi, Dennis!  How old are you?");
            String line2 = Scanner2.nextLine();
            if (line2.equals("37")) {
                Scanner Scanner3 = new Scanner(System.in);
                System.out.println("So you're 37, eh?  That's not old at all!\n" +
                        "How much do you make, Dennis?");
                String line3 = Scanner3.nextLine();
                if (line3.equals("8.50")) {
                    System.out.println("8.5!  I hope that's per hour and not per year! LOL!");
                }
            }
        }
        if (line1.equals("Catsup")) {
            Scanner Scanner2 = new Scanner(System.in);
            System.out.println("Hi, Catsup!  How old are you?");
            String line2 = Scanner2.nextLine();
            if (line2.equals("12")) {
                Scanner Scanner3 = new Scanner(System.in);
                System.out.println("So you're 12, eh?  That's not old at all!\n" +
                        "How much do you make, Catsup?");
                String line3 = Scanner3.nextLine();
                if (line3.equals("99.9")) {
                    System.out.println("99.9!  I hope that's per hour and not per year! LOL!");
                }
            }
        }
    }
}
