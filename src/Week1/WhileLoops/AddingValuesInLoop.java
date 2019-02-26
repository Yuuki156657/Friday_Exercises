package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main( String[] args )
    {

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");

        Scanner keyboard = new Scanner(System.in);
        int value = keyboard.nextInt();
        int sum = value;

        while ( value != 0 )
        {
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");
            value = keyboard.nextInt();
            sum += value;

        }
        System.out.println("\nThe total is " + sum);
    }
}
