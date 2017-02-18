import java.io.*;

public class Striker {
	public static void main(String[] args) throws Exception, InterruptedException {

		int playerOne, playerTwo;	// initializes integers
		int counter = 0;			// declares the counter for how many guesses player two has made

		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;	// initializes string

		System.out.println("Welcome to Striker... A guessing game!");
		Thread.sleep(200);	// pauses for .2 seconds
		System.out.println("\n" + "Player one.. Please enter a number under 1000 to be guessed:");	// makes new line, asks for player 1 input
		inData = stdin.readLine();
		playerOne = Integer.parseInt(inData);	// declares int PlayerOne as the inData

		
		Thread.sleep(200);	// pauses for .2 seconds
		System.out.println("Player two.. Guess the number:");	// asks for player 2 to guess
		inData = stdin.readLine();
		playerTwo = Integer.parseInt(inData);	// declares int playerTwo and inData

		while (playerOne != playerTwo) {	// while the player 1 input doesn't equal player 2 input it will do..
			if (playerTwo < playerOne) {	// if the guess is smaller than player 1 input..
				System.out.println("Your guess is too low! Please try again.");	// it will ask to try again
				inData = stdin.readLine();
				playerTwo = Integer.parseInt(inData);	// try again 
				counter++;	// adds 1 to the counter int
			} else if (playerTwo > playerOne) {	// if the guess is bigger than player 1 input..
				System.out.println("Your guess is too high! Please try again.");	// it will ask to try again
				inData = stdin.readLine();
				playerTwo = Integer.parseInt(inData);	// try again
				counter++;		// adds 1 to the counter int.
			}
		}
		System.out.println("Congratulations, you guessed it correctly!");	// if the guess equals the player two input
		System.out.println("\n" + "It took " + counter + " guesses to determine your number.");	// makes new line, and tells how many guesses it took
		Thread.sleep(200);	// pauses for .2 seconds
		System.out.println("\n" + "Thanks for playing Striker!");	// makes new line, prints string.
	}
}