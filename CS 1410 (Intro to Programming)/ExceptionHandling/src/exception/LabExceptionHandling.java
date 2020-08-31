package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandling {
	
	public static void main(String[] args)
	{
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
		} catch (Exception e) {
			System.out.println("A Problem Occured: " + e.getMessage());
		}
	}

	private static int numberFromUser()
	{
		boolean done = false;
		int rv = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			try {
			System.out.print("number: ");
			rv = input.nextInt();
			done = true;
			
			} catch(InputMismatchException e) {	
				System.out.println("Error: Enter a whole number.\n");
				input.nextLine();
			}
			
		} while (!done);
		  return rv;
	}

	private static int sevenModulusN(int number)
	{
		if (number == 0) throw new IllegalArgumentException ("I can't calculate 7 % 0! I am a bad bot!");
		return 7 % number;
	}

}