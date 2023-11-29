import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Guess
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        //User input for x and y

        System.out.print("Enter a Minimum value: ");
        int x = sc.nextInt();

        System.out.print("Enter a Maximum value: ");
        int y = sc.nextInt();


        if (x >= y) {
            System.out.println("Error: Maximum value must be greater than the Minimum value! ");
            return;
        }
        /*Using the ThreadLocalRandom class to generate random numbers withing
        the current thread, the '(x,y+1)' is the range in which the random number
        generator is limited to, generating random numbers within the range.
        The '+1' ensures that the numbers generated is inclusive to the range from
        'x' to 'y'.
         */
        int RandomNumber = ThreadLocalRandom.current().nextInt(x, y + 1);
        System.out.println("Guess away! :");

        int guesses;
        int NumberOfGuesses = 0;

        do{
            // Takes in user guesses
            guesses = sc.nextInt();
            /*Number of guesses increases as the user
            tries to guess the right number until the
            user guesses the right answer
             */
            NumberOfGuesses++;

            if(guesses > RandomNumber)
            {
                System.out.println("That's too high! Try a smaller number");
            }
            else if(guesses < RandomNumber)
            {
                System.out.println("That's too low! Try a higher number");
            }
            else
            {
                System.out.println("Congratulations you guessed the right number in "+NumberOfGuesses+" guesses");
            }


        }
        while(guesses != RandomNumber);
        //Once number guessed, scanner closes
        sc.close();

    }

}