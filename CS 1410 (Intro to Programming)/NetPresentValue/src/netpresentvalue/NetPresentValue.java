/*
 * Jp Otteson
 * Net Present Value Program
 */
package netpresentvalue;

import java.util.Scanner;
import java.lang.Math;

public class NetPresentValue {

    public static void main(String[] args) {
        
        //Variables
        Scanner scnr = new Scanner(System.in);
        int presentYear = 0;
        double discountRate = 0.0;
        int cashYear = 0;
        double cashValue = 0.0;
        double netPresentValue = 0.0;
        String Repeat = "Y";
        double currentPresentValue = 0.0;
        
        //Get initial input from user
        //Prompt for current year and read current year
        System.out.println("Enter present year: ");
        presentYear = scnr.nextInt();
        //Prompt for and read discount
        System.out.println("Enter discount rate as a fraction: ");
        discountRate = scnr.nextDouble();
        
        
        //Do while...
        do {
            //Prompt for and read cash year
            System.out.println("Enter year of net cash flow: ");
            cashYear = scnr.nextInt ();
            //Prompt for and read cash flow
            System.out.println("Enter net cash flow: ");
            cashValue = scnr.nextDouble();
            //Repeat?
            System.out.println("Any more cash flows (Y/N)? ");
            Repeat = scnr.next();
            //Calculation for end variable
            currentPresentValue += (cashValue / (Math.pow (1 + discountRate, cashYear - presentYear)));
 
            } while (Repeat.contains("Y"));    
            
            //Calculate & Sum
            
            System.out.printf("Net Present Value =  %,-+10.2f" , currentPresentValue);

    }
}