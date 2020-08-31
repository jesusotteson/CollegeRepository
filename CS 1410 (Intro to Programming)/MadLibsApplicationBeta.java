/**
 * @author Jesus Otteson
 * MadLibs Application
 */
import java.util.Scanner;

public class MadLibsApplicationBeta { 
    public static void main(String[] args) {
        String nameInput ; // This is where the user inputs their name.
        String relativeInput ; // This is where the user inputs a relative.
        String verbInput ; // This is where the user inputs a verb.
        
        Scanner scnr = new Scanner(System.in); /*The scanner code to pick up
                                               * the users inputs
                                               */
        
        System.out.println("Enter your name: "); //These next 6 line are where the
        nameInput = scnr.nextLine();             //program reads the information
                                                 //that the user has inputed. The
        System.out.println("Enter a relative: ");//user is able to input the
        relativeInput = scnr.nextLine();         //information by submitting it
                                                 //where the program asks them too.
        System.out.println("Enter a verb: ");     
        verbInput = scnr.nextLine();              
        
        System.out.print(nameInput + ", the ruler of Middle Earth,"); //This is where the program
        System.out.println("the " + relativeInput + " of Sauron,");   //prints out the users
        System.out.println("will make you " + verbInput + "!");       //submittions with the added
                                                                      //text to create the MadLib.
        
        
    }
}