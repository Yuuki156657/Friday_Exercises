package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String a = in1.next();

        System.out.println("Ok, " + a + ", how old are you?");
        int b = in1.nextInt();

        if (b < 16) {
            System.out.println("You can't drive, " + a + ".");
        }
        else if (b == 16 || b == 17) {
            System.out.println("You can drive but not vote, " + a + ".");
        }
        else if (b >= 18 && b <= 24) {
            System.out.println("You can vote but not rent a car, " + a + ".");
        }
        else {
            System.out.println("You can do pretty much anything, " + a + ".");
        }
    }
}
