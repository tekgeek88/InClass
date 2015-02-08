import java.util.Scanner;


public class ClassArray {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		int i = 0;		// Array index position
		//int userInput;	//
		int myArray[];
		int arraySize = 0;
		int arrayValue = 5;
		
		// Let user enter the value for the size of the index
		System.out.print("Enter the size of your array: ");
		arraySize = in.nextInt();
		myArray = new int [arraySize];
		
		
		for (i = 0; i < myArray.length; i++) {
			
			myArray[i]=arrayValue;
			System.out.println("the value at index: " + i + " is " + myArray[i]);
			arrayValue = arrayValue + 1;
		}
		
		for (int j = 0; j < myArray.length; j++) {
			
		}
		
		for (int j = 0; j < myArray.length; j++) {
			
		}
		
		in.close();
		
		System.out.println("hello");
	}

}
