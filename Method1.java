/**
 * A program that does calculations using the form
 * A +-/* B = C
 * @author TekGeek88
 *
 */
public class Method1 { // Beginning of Method1

	// declare the variables to be used on our program and make them local variables
	static double a;		
	static char operator;
	static double b;
	static double c = 0;	// the result of the mathimnatical operamtoiasnfaspfmasf
	
	
	
	public static void main(String[] args) { // Beginning of main method

		boolean playAgain;
		playAgain = true;
		int gamesPlayed;
		
		do {
			for (gamesPlayed = 1;(gamesPlayed<4 && playAgain);gamesPlayed++){
				DoSomeMath();

				if (!(gamesPlayed == 0)){

					System.out.println("The number of games you have played is: " + gamesPlayed);
				}
				System.out.print("\nDo you want to play again? enter yes or no: ");
				playAgain = TextIO.getBoolean();
			} // end of for loop

		
		} // end of do loop
		while (playAgain);

		System.out.println("\n\nThe program has completed!");
	} // end of main method

	
	static void DoSomeMath(){
	// Let the user choose the value of the variables to be used
			System.out.print("Enter a number for the value of 'a': ");
			a = TextIO.getDouble();
			System.out.print("Enter a number for the value of 'the operator': ");
			operator = TextIO.getChar();
			System.out.print("Enter a number for the value of 'b': ");
			b = TextIO.getDouble();
			
			// Verify the input to user
			System.out.println("\nYou entered: " + a + " " + operator + " " + b);
			
			
			
			if (operator == '+') {
				c = CustomMath.addition(a, b);
			}
			else if (operator == '-') {
				c = CustomMath.subtraction(a, b);
			}
			else if (operator == '*') {
				c = CustomMath.multiplication(a, b);
			}
			else if (operator == '/') {
				c = CustomMath.division(a, b);
			}
			else 
				System.out.println("\nAn invalid operator was entered");
			
			
			System.out.println("\nThe result is: " + c);
	
	}// end of DoSomeMath()
	
} // end of method1 class
