/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Remember to put your name and SH username above

import java.util.Random;
import java.util.Scanner;

public class Main
{
    //Global variables
    public static Random random = new Random();

    public static void main(String[] args)
    {
        methodReminder();
    }

    //Below is an example method showing how to generate a random number.
    //You should delete it repurpose it.
    public static void methodReminder()
    {
        int num = random.nextInt(0, 5);
        System.out.println("Here's a random number between 0 and 4: " + num);
    }
}