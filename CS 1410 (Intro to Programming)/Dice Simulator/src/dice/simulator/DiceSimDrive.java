package dice.simulator;
import java.util.Random;
import java.util.Scanner;

public class DiceSimDrive {
    
public static void main(String[] args)
{
        Scanner stdIn = new Scanner (System.in);
        String choice;           //user's choice of action
        boolean done = false;    // user's quit flag
        
        DiceSimulator diceSimulation = new DiceSimulator ();
        System.out.println(
                "Welsome to the dice throwing simulator!\n");
    
    do
        {
         System.out.println(
            "Options: (n)ew simulation, (a)dditional rolls," +
            " (p)rint, (q)uit");
         System.out.print("Enter n, a, p, or q ==> ");
         choice = stdIn.nextLine();
         
         switch (choice.charAt(0))
         {
             case 'n': case 'N':
                 diceSimulation.newSimulation();
                 break;
             case 'a': case 'A':
                 diceSimulation.additionalRolls();
             case 'p': case 'P':
                 diceSimulation.printReport();
             case 'q': case'Q':
                 done = true;
                 break;
             default:
                 System.out.println("Invalid selection.");
            }  // end switch
        } while (!done);
    }
}  //end main
