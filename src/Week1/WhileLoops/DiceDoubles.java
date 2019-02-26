package Week1.WhileLoops;

import java.util.Random;


public class DiceDoubles {

    public static void main( String[] args )
    {
        Random r = new Random();
        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);

        while ( dice1 != dice2 )
            {
                dice1 = 1 + r.nextInt(6);
                dice2 = 1 + r.nextInt(6);

                System.out.print("Roll #1: " + dice1 + "\n");
                System.out.print("Roll #2: " + dice2 + "\n");
                System.out.println("The total is " + (dice1 + dice2) + "!\n");
            }
    }
}
