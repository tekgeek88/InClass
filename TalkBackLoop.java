
public class TalkBackLoop {
	//public static int sleep;
		//Declare the variables to be used in the program
	public static void talkBack(String userInput){	

		int sleep;
		sleep = 0;
		int charAtPostition=0;
		
		//Print to standard output what user entered for the string
		//System.out.println("\nI will now type back to you the string you just entered: \n");
		 // Position of a character in the string userInput.
	      while (charAtPostition < userInput.length()) { // while position is not at the last letter of the string
	    	  System.out.print(userInput.charAt(charAtPostition)); // prints the character at current position of string 
	    	  try { // beginning of wait routine
	    		  Thread.sleep(sleep);                 //1000 milliseconds is one second.
	    	  } // end of try
	    	  catch(InterruptedException ex){
	    	  }	//End of Wait
	    	  sleep = (int)((Math.random()*100)+1);
	    	  //System.out.println("the value of sleep is: " + sleep);
	    	  charAtPostition = charAtPostition+1;
	      }// end of while loop
	
	
	} // end of talkBack() method

	public static void talkBackln(String userInput){	

		int sleep;
		sleep = 0;
		int charAtPostition=0;
		
		//Print to standard output what user entered for the string
		//System.out.println("\nI will now type back to you the string you just entered: \n");
		 // Position of a character in the string userInput.
	      while (charAtPostition < userInput.length()) { // while position is not at the last letter of the string
	    	  System.out.print(userInput.charAt(charAtPostition)); // prints the character at current position of string 
	    	  try { // beginning of wait routine
	    		  Thread.sleep(sleep);                 //1000 milliseconds is one second.
	    	  } // end of try
	    	  catch(InterruptedException ex){
	    	  }	//End of Wait
	    	  sleep = (int)((Math.random()*100)+1);
	    	  //System.out.println("the value of sleep is: " + sleep);
	    	  charAtPostition = charAtPostition+1;
	      }// end of while loop
	
	      System.out.println();
	
	} // end of talkBack() method

	
} // end of class
