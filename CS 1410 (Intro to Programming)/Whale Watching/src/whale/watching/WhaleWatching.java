/*
 *Jp Otteson
 *Whale Watching Program
 */
package whale.watching;
//Imports
import java.util.Scanner;

public class WhaleWatching {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner (System.in);
        
        WhaleLengthCalculator whale;
        String another;
        whale = new WhaleLengthCalculator();
        whale.LinearRegressionForCamera();
        whale.LinearRegressionForWhale();
        
        do{
            whale.promptForRange();
            whale.promptForPixels();
            whale.displayLength();
            System.out.print("Calculate another whale length (y/n)? ");
            another = stdIn.nextLine();
        } while (another.equalsIgnoreCase ("y"));
    }
}
    

