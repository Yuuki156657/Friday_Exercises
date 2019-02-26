package Week1.ForLoops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        for (int j = 1; j <= i; j++) {

            String k = "";

            if (j % 15 == 0) {
                k = "FizzBuzz";
            }
            else if (j % 3 == 0) {
                k = "Fizz";
            }
            else if (j % 5 == 0) {
                k = "Buzz";
            }
            if(k.length() == 0) {
                k += j;
            }
            System.out.println(k);
        }
    }
}
