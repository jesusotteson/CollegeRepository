import java.util.Scanner;


public class Palindrome 
{
	public static void main(String[] args) 
	{
		if (args.length != 0)
		{
		    String possiblepalindrome = args[0];
		    int i = args[0].length()-1;
		    int i2 = args[0].length();
		    char [] aChar = new char[i2];

		    for ( int i3 = i; i3 > -1; i3-- ) 
		    {
		    	aChar[i2-i3-1] = (possiblepalindrome.charAt(i3) );
		    }

	        String s2 = String.valueOf(aChar);

	        if ( s2.equals(possiblepalindrome) ) 
	        {
	            System.out.println(possiblepalindrome + " is a palindrome!");
	        } 
	        
	        else 
	        { 
	        	System.out.println(possiblepalindrome + " is not a palindrome");
	        }
		} 
		
		else 
		{	
	    	@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        System.out.println("Please enter a potential palindrome: ");
	        String possiblepalindrome= input.nextLine();
	        
		    int i = possiblepalindrome.length()-1;
		    int i2 = possiblepalindrome.length();
		    char [] aChar = new char[i2];
	
		    for ( int i3 = i; i3 > -1; i3-- ) 
		    {
		    	aChar[i2-i3-1] = (possiblepalindrome.charAt(i3) );
	        }
	
	        String s2 = String.valueOf(aChar);
	
	        if ( s2.equals(possiblepalindrome) ) 
	        {
	            System.out.println(possiblepalindrome + " is a palindrome");
	        } 
	        else 
	        { 
	            System.out.println(possiblepalindrome + " is not a palindrome");
	        }    
		}
	}
}
