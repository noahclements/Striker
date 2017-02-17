import java.io.*;

public class Striker {
	public static void main(String[] args) throws Exception, InterruptedException{
		
		int playerOne, playerTwo;
		int counter = 0;
		
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;	// declares data input String as inData
		
		
		
		System.out.println("Welcome to Striker... A guessing game!");
		Thread.sleep(200);
		System.out.println("\n" + "Player one.. Please enter a number to be guessed:");
		inData = stdin.readLine();
		playerOne = Integer.parseInt(inData);	// assigns playerOne as the data input
		
		Thread.sleep(200);
		System.out.println("Player two.. Guess the number:");
		inData = stdin.readLine();
		playerTwo = Integer.parseInt(inData);	// assigns playerTwo as the data input
		
		do {
			System.out.println("Your guess is too low! Please try again.");
			inData = stdin.readLine();
			playerTwo = Integer.parseInt(inData);	// assigns playerTwo as the data input
			counter++;
		} while (playerTwo < playerOne);
		
		do {
			System.out.println("Your guess is too high! Please try again.");
			inData = stdin.readLine();
			playerTwo = Integer.parseInt(inData);	// assigns playerTwo as the data input
			counter++;
		} while (playerTwo > playerOne);
		
		if (playerTwo == playerOne) {
			System.out.println("Congratulations, you guessed it correctly!");
			System.out.println("\n" + "It took " + counter + " guesses to determine your number.");
		}
	}
}
