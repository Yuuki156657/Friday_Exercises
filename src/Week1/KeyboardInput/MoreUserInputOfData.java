package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System. in);
        System.out.println("Please enter the following information so I can sell it for a profit!\n" +
                "\nFirst name: ");
        String a = in.next();

        System.out.println("Last name: ");
        String b = in.next();

        System.out.println("Grade (9-12): ");
        int c = in.nextInt();

        System.out.println("Student ID: ");
        int d = in.nextInt();

        System.out.println("Login: ");
        String e = in.next();

        System.out.println("GPA (0.0-4.0): ");
        float f = in.nextFloat();

        String g = String.format("\nYour information:\n" +
                "         Login: " + e + "\n" +
                "         ID:    " + d + "\n" +
                "         Name:  " + b + ", " + a + "\n" +
                "         GPA:   " + f + "\n" +
                "         Grade  " + c);
        System.out.println(g);
    }
}
