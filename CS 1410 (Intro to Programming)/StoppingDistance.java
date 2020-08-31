/*
 *Jp Otteson
 *Stopping Distance Program
 */
package stopping.distance;
import java.util.Scanner;
import java.lang.Math;
public class StoppingDistance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            // These are the variables in the equation
            final double RANGE = 40.0;
            double tailgateDistance = 0.0;
            double speed = 0.0;
            double stoppingDistance = 0.0;
            
            //System print out "Enter your speed in mph:
            //Scan user input
            System.out.println("Please enter how fast you are going (In MPH):");
            speed = input.nextDouble();
            
            //System print out "Enter your tailgate distance in feet:
            // Scan user input
            System.out.println("Please enter tailgate distance(In FEET):");
            tailgateDistance = input.nextDouble();
            
            //calculate stopping distance
            stoppingDistance = speed * (2.25 + speed / 21);
  
            //No Wreck equation
                //print out "No Wreck"    
            if (stoppingDistance < (tailgateDistance - (RANGE / 2))){
                System.out.println("No Wreck");
                }
            //Minor Wreck equation
                //print out "Minor Wreck"
            else if (Math.abs(stoppingDistance - tailgateDistance) < (RANGE / 2)){
                System.out.println("Minor Wreck");
                }
            //Major Wreck equation
                //print out "Major Wreck"       
            else {
                System.out.println("Major Wreck");
                }       
        }
    }
    
}//End of Class
