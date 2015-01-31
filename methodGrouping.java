
public class methodGrouping { // main class
	
	
	
	public static void main(String[] args) { // main method
	
		int userInput;
		boolean playAgain=true;
		int inputPlayAgain;
		
		
		while (playAgain){
		System.out.println("\nWhich figure do you want to print?");
		System.out.println("\nPress: '1' for figure 1\nPress: '2' for figure 2\nPress: '3' for figure 3\nPress: '4' for figure 4\nPress: '5' for all figures");
		System.out.print("\n\nPlease enter your selection: ");
		userInput = TextIO.getInt();
		
		while (userInput < 1 || userInput > 5){
			System.out.print("Please re-enter your selection between 1 and 5: ");
			userInput = TextIO.getInt();
		
		}
		if (userInput == 1){
			figure1();	
		}
		
		else if (userInput == 2){
			figure2();
		}
		
		else if (userInput == 3){
			figure3();
		}
		
		else if (userInput == 4){
			figure4();
		}
		
		else if (userInput == 5){
			allFigures();
		}
		
		System.out.println("Print another one? enter '1' for yes or '2' for no: ");
		inputPlayAgain = TextIO.getInt();
		while (inputPlayAgain < 1 || inputPlayAgain > 2){
			inputPlayAgain = TextIO.getInt();
			System.out.print("That is not a valid selection, please enter '1' for yes or '2' for no: ");
				
		}//end of while inputPlayAgina
		
		if (inputPlayAgain == 1){
			playAgain = true;
			System.out.println("\nContinuing program");
		}
		else if (inputPlayAgain == 2){
			playAgain = false;
			System.out.println("\nExiting program");
		}
	
		}// end of while loop
	
		System.out.println("\nProgram has terminated succesfully");
		
	} // end of main method
	
	public static void allFigures (){
		figure1();
		figure2();
		figure3();
		figure4();
		}
	
	    
		public static void figure1 (){
			System.out.println();
			System.out.println("  ______");
			System.out.println(" /      \\");
			System.out.println("/        \\");
			System.out.println("\\        /");
			System.out.println(" \\______/");
			System.out.println();
		}
        
        public static void figure2 (){ 
    	    System.out.println();
    	    System.out.println("\\        /");
    	    System.out.println(" \\______/");
    	    System.out.println("+--------+");
    	    System.out.println();
        }
        
        public static void figure3 (){
        	System.out.println("  ______");
        	System.out.println(" /      \\");
        	System.out.println("/        \\");
        	System.out.println("|  STOP  |");
        	System.out.println("\\        /");
        	System.out.println(" \\______/");
        	System.out.println();
        }
        
        public static void figure4 (){   
        	System.out.println("  ______");
        	System.out.println(" /      \\");
        	System.out.println("/        \\");
        	System.out.println("+--------+");
        }

}	// end of class
	
	
	
	
	
	
