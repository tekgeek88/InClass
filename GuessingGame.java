
public class GuessingGame {
	
	public static void main(String[] args){
		TalkBackLoop.talkBackln("\n\nLet's play a game.  I'll pick a number between");
		TalkBackLoop.talkBackln("1 and 100, and you try and guess it.");
		boolean playAgain;
		
		do {
			playGame();	// call subroutine to play one game
			TalkBackLoop.talkBack("\n\nWould you like to play again?");
			playAgain = TextIO.getlnBoolean();
		}
		while (playAgain);
		TalkBackLoop.talkBack("\nThanks for playing.  Goodbye.");
		
	}// end of main

	
	static void playGame() {
		
		int computersNumber;	// A random number picked by the computer.
		int usersGuess;			// A number entered by the user as a guess.
		int guessCount;			// Number of guess the suer has made.
		computersNumber = (int)(100* Math.random()) + 1;
			// The value assigned to computersNumber is a randomly
			// chosen integer between 1 and 100, inclusive.
		guessCount = 0;
		System.out.println();
		TalkBackLoop.talkBack("What is your first guess? ");
		while (true) {
			usersGuess = TextIO.getInt();	// Get the user's guess.
			guessCount++;
			if (usersGuess == computersNumber) {
				TalkBackLoop.talkBackln("\nYou Got it in " + guessCount
				+  " guesses!  My number was " + computersNumber);
				break;	// The game is over; the user has one.
			}// end while loop
			// If we get to this point, the game continues.
			// Tell the user if the guess was too high or too low.
			if (usersGuess < computersNumber)
				TalkBackLoop.talkBack("That's too low.  Try agin: ");
			else if (usersGuess > computersNumber)
				TalkBackLoop.talkBack("That's too high.  Try again: ");
		} // end while loop
		TalkBackLoop.talkBackln("\nGame over");
	
		
	} // end of playGame()
}