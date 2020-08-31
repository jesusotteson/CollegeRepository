/*
 *Jp Otteson
 *Whale Watching Program
 */
package whale.watching;

//Imports
import java.util.Scanner;
import java.util.InputMismatchException;
//import java.math.*;
public class WhaleLengthCalculator {
    // Attributes
    double cameraSlopeValue;
    double cameraYintercept;
    double cameraRange;
    int numberOfCameraPixels;
    double flukeSlope;
    double flukeYIntercept;
    double whaleSlopeValue;
    double whaleYintercept;
    double totalLength;

    //methods
    //linearRegressionforCamera - for equation1
    public void LinearRegressionForCamera() {
        boolean loop;
        Scanner scnr = new Scanner (System.in);
        //prompt for and save slope & yInt
        System.out.println("Enter a positive decimal number for the camera's linear regression slope: ");
        cameraSlopeValue = scnr.nextDouble();
        System.out.println("Enter a decimal number for the camera's linear regression y intercept: ");
        cameraYintercept = scnr.nextDouble();
        
        do {   // for slope
            loop = true;
            try {
                cameraSlopeValue = scnr.nextDouble(); /*slope
                                                       *prompt & read slope
                                                       test for positive slope*/
                if (cameraSlopeValue < 0) {
                    //throw an Exception "Slope must be positive"
                    throw new Exception("Slope must be positive.");
                    }
                }
            catch (InputMismatchException excpt1 ) {
                //read & ignore orphaned 'cr' with scnr.next()
                scnr.next();
                //InputMismatchException, must be first because it is most specific
                System.out.println("Invalid Entry");
               //the InputMismatchException object might have a null message..
                System.out.println(excpt1.getMessage());
                loop = false;
                }        
                catch (Exception excpt2) {
                //negative slope
                //print out exception message
                System.out.println(excpt2.getMessage());
                //set while control to loop = false
                loop = false;
                } 
        }while (!loop);
    }   //end of camera
    
    

   //linearRegressionForWhale - for equation2
    public void LinearRegressionForWhale(){
         boolean loop;
        Scanner scnr = new Scanner (System.in);
        //prompt for and save slope & yInt
        System.out.println("Enter a positive decimal number for the whale's linear regression slope: ");
        whaleSlopeValue = scnr.nextDouble();
        System.out.println("Enter a decimal number for the whale's linear regression y intercept: ");
        whaleYintercept = scnr.nextDouble();
        
        do {   // for slope
            loop = true;
            try {
                whaleSlopeValue = scnr.nextDouble(); /*slope
                                                       *prompt & read slope
                                                       test for positive slope*/
                if (whaleSlopeValue < 0) {
                    //throw an Exception "Slope must be positive"
                    throw new Exception("Slope must be positive.");
                    }
                }
            catch (InputMismatchException excpt1 ) {
                //read & ignore orphaned 'cr' with scnr.next()
                scnr.next();
                //InputMismatchException, must be first because it is most specific
                System.out.println("Invalid Entry");
               //the InputMismatchException object might have a null message..
                System.out.println(excpt1.getMessage());
                loop = false;
                }        
                catch (Exception excpt2) {
                //negative slope
                //print out exception message
                System.out.println(excpt2.getMessage());
                //set while control to loop = false
                loop = false;
                }
        } while (!loop);
    }   //end of whale
    
    
    public void promptForRange(){ 
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter a positive decimal number for the camera's range in meters: ");
        cameraRange = scnr.nextDouble();
    }
    
    public void promptForPixels(){
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter a positive integer for the number of pixels: ");
        numberOfCameraPixels = scnr.nextInt(); 
    }
    
    public void displayLength(){
        //local variables flukeSpan & whaleLength
        double flukeSpan;
        double whaleLength;
        double expnt;
        
        //compute flukeSpan & whaleLength
        flukeSpan = (cameraSlopeValue * cameraRange + cameraYintercept) * numberOfCameraPixels;
        expnt = whaleSlopeValue * Math.log10(flukeSpan) + whaleYintercept;
        whaleLength = Math.pow(10, expnt);
    }
    
    //Constructor
    public WhaleLengthCalculator() {
        
    }

    
}
