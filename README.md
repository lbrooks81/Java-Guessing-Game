CP132 Lab 3

In this lab, you’ll get some practice in writing a command-line application.

Specifications

For games to hold your interest, they almost always include some random, unpredictable behavior. For
example, a game in which you shoot asteroids loses some of its fun if the asteroids follow the same,
predictable path each time you play. Therefore, generating random values is a key component in
creating most interesting computer games. Many programming languages come with a built-in
module you can use to generate random numbers. In Java, the syntax is the following:

int myRandomNumber = random.NextInt(0, 11);

In this statement, myRandomNumber is a numeric variable you have declared and the expression
random.Next(0, 11) means “call a method that returns a random number between 0 and 10.”
Why between 0 and 10 and not 0 and 11? It is because the upper bound is excluded.

Create code that generates a random number and then asks the user to think of a number between 1 and
100. Then display the message that tells the user if they were too high, too low, or guessed correctly.
Only let the user guess incorrectly 5 times before they lose.

Constraints
 Prompt the user before every input.
◦ Ex: “Enter a number between...: ”
 Echo every input.
◦ Ex: “You entered ‘50’.”
 The logic to prompt the user and then get their input should be in their own method.
 The logic that allows the user to keep guessing should be in its own method.
 The outputs before the end of the program should be in their own method.
 Echo out how many guesses the user has left after every guess.
 Close the input Scanner when there are no more inputs.

Extra Credit Opportunity
 (1 pt) Implement a way to let the user to choose to play again with a new random number after
they win or lose.
 (1 pt) Allow the user to input how many guesses they can have have and the upper range for the
random number.

Scoring Rubric
10/10 Program meets specifications.
9-6/10 Program does not meet specifications but there was noticeable effort.
5-0/10 Program does not meet specifications and there was little effort put in.

Submission
The submission for this lab is the commit ID you want to be graded. You will submit it via the Canvas
assignment.
