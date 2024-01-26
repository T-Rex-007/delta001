package banker;

import java.util.Scanner;

public class holiday {
	
	public void  method() {
		
		  Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.println("Enter a number (or any non-numeric value to exit):");

	        // Loop to calculate the square of user-entered numbers
	        while (true) {
	            try {
	                // Read the input as a string
	                String input = scanner.nextLine();

	                // Attempt to convert the input to a double
	                double num = Double.parseDouble(input);

	                // Calculate the square of the number and print it
	                double square = num * num;
	                System.out.println("The square of " + num + " is " + square);

	            } catch (NumberFormatException e) {
	                // If the input cannot be converted to a number, exit the loop
	                System.out.println("Exiting the program.");
	                break;
	            }
	        }

	        // Close the scanner
	        scanner.close();
	    }

		
		
		
		
	}
	


