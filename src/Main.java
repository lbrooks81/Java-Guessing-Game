/*
 * Name: [Logan Brooks]
 * South Hills Username: [lbrooks81]
 */
//Remember to put your name and SH username above

import java.util.Random;
import java.util.Scanner;

public class Main
{
    //Global variables
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    public static int guessedNumber = 0;
    public static int randomNum = 0;
    public static int guessesRemaining = 0;
    public static int upperBound = 0;
    public static void main(String[] args)
    {
        System.out.print("Please enter the upper bound of the range for random numbers: ");
        upperBound = input.nextInt();
        System.out.print("Please enter the amount of guesses you'd like: ");
        guessesRemaining = input.nextInt();
        randomNum = random.nextInt(0, upperBound);
        guessPrompt();
        loop();
        outputs();
    }
    public static void guessPrompt()
    {
        System.out.println(randomNum);
        System.out.print("Guess a number from 0 to " + upperBound + ": ");
        guessedNumber = input.nextInt();
        System.out.println("You guessed '" + guessedNumber + "'.");
        if(guessedNumber > upperBound)
        {
            System.out.println("This number is beyond the range of numbers.");
            guessPrompt();
        }
    }
    public static void outputs()
    {
        if(guessedNumber == randomNum)
        {
            System.out.println("You got it!");
        }
        else
        {
            System.out.println("You ran out of guesses. The number was " + randomNum + ".");
        }

    }
    public static void loop()
    {
        while (guessedNumber != randomNum && guessesRemaining != 1)
        {
            guessesRemaining--;
            if(guessedNumber > randomNum)
            {
                System.out.println("Your number is too high. You have " + guessesRemaining + " guesses left.");
            }
            else
            {
                System.out.println("Your number is too low. You have " + guessesRemaining + " guesses left.");
            }
            guessPrompt();
        }

    }
}