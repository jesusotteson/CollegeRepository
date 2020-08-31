package dice.simulator;

//@author Jp
import java.util.Scanner;
import java.util.Random;
public class DiceSimulator {
      
    //attributes
       int numberOfRolls;
       int[] frequency;
   public static void main(String[] args) {
   }

       //Methods
        public void newSimulation(){
            //Scanner
            Scanner stdIn = new Scanner (System.in);
            
            //clear freq.
            for (int i=0; i < 13; i++){
                frequency[i] = 0;
            }
            //prompt #rolls
            System.out.println("How many dice rolls would you like to simulate?");
                    numberOfRolls = stdIn.nextInt();
            //simulate rolls
            for (int i=0; i < numberOfRolls; i++){
                frequency[(int) (Math.random()* 6 + 1) + (int) (Math.random()* 6 + 1)]++;
            }
        }
        public void additionalRolls(){
            //Scanner
            Scanner stdIn = new Scanner (System.in);
            //prompt #rolls
            System.out.println("How many additional dice rolls would you like to simulate?");
                    numberOfRolls = stdIn.nextInt();
            //simulate rolls
            for (int i=0; i < numberOfRolls; i++){
                frequency[(int) (Math.random()* 6 + 1) + (int) (Math.random()* 6 + 1)]++;
            }
        }
        //printReport
        public void printReport()
        {
            String rollSpace = " ";
            float tRolls;
            int numofAsterisks;
            double onePercent = numberOfRolls / 100 ;
            int sum;
            int i;
            System.out.println("DICE ROLLING SIMULATION RESULTS");
            System.out.println("Each '*' represents 1% of the total number of dice rolls.");
            System.out.println("Total number of rolls = " + numberOfRolls);
            
            for(sum=2; sum<=12; sum++)
            {
                rollSpace = "";
                tRolls = (float) frequency[sum]/numberOfRolls;
                numofAsterisks = Math.round(tRolls * 100);
                numofAsterisks = (int) (frequency[sum] / onePercent);
                System.out.println(sum + ": ");
                if(sum<10)
                {
                  rollSpace += "";
                }
                rollSpace += sum+":";
                for(i=0; i<numofAsterisks ; i++)
                {
                    rollSpace += "*";
                    System.out.print("*");
                }
            }
        }
}
        
 
