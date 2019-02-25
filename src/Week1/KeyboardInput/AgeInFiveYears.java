package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String a = in.next();

        System.out.println("Hi, " + a + "!  How old are you?");
        int b = in.nextInt();

        System.out.println("Did you know that in five years you will be " + (b + 5) + " years old?\n" +
                "And five years ago you were " + (b - 5) + "! Imagine that!");
    }
}
