//import java.util.Scanner;	// For version 2
import javax.swing.JOptionPane; // For version 3


public class NameBox 
{

	public static void main(String[] args) 
	{
//		Version 1
//		int count = 0;
//		
//		for (int i = 0; i < args.length; i++)
//		{
//			count += args[i].length();
//		}
//		
//		count += args.length - 1;
	
//		Version 2
//		@SuppressWarnings("resource")
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter your name: ");
//		
//		String name = input.nextLine();
		
//		Version 3
		String name = JOptionPane.showInputDialog(null, "Enter your name", "Data Input", JOptionPane.QUESTION_MESSAGE);
		
		if (name == null || name.equals(""))
		{
			System.err.println("No data entered, application shutting down.");
			System.exit(1);
		}
		
		int count = name.length();// For Version 2 & 3
		
		System.out.print("+");
		
		for (int i=0; i < count; i++)
		{
			System.out.print("-");
		}
		
		System.out.println("+");
		
//		Version 1
//		System.out.print("|");
//		
//		for ( int i=0; i < args.length - 1; i++)
//		{
//			System.out.print(args[i] + " ");
//		}
//		
//		System.out.println(args[args.length - 1] + "|"); // The final element of the array is going to be length - 1
		
		System.out.println("|" + name + "|");
		
		System.out.print("+");
		
		for (int i=0; i < count; i++)
		{
			System.out.print("-");
		}
		
		System.out.println("+");
	}

}
