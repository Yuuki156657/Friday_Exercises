package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {

        System.out.print("Count to: ");

        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        for (int j = 0; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }
}
