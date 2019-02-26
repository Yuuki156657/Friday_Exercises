package Week1.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int x = 1 + r.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();

        while ( guess != x )
        {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
}



//
//        int x = 1 + r.nextInt(10);
//
//        System.out.println( "My random number is " + x );
//
//        System.out.println( "Here are some numbers from 1 to 5!" );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.print( 1 + r.nextInt(5) + " " );
//        System.out.println();
//
//        System.out.println( "Here are some numbers from 1 to 100!" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.println();




//        int num1 = 1 + r.nextInt(10);
//        int num2 = 1 + r.nextInt(10);
//
////        if ( num1 == num2 )
////        {
////            System.out.println(num1);
////            System.out.println(num2);
////            System.out.println( "The random numbers were the same! Weird." );
////        }
//        while ( num1 != num2 )
//        {
//            System.out.println(num1);
//            num2 = 1 + r.nextInt(10);
//            System.out.println(num2);
//            System.out.println( "The random numbers were different! Not too surprising, actually." );
//        }
//    }
//}
