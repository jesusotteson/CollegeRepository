/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar;
import java.util.Scanner;
public class Guitar {
    
    public static void main(String[] args) {
        double stepSize;
        double numStep;
        double time = 0;
        double change;
        GuitarString eString = new GuitarString();
        Scanner input = new Scanner(System.in);
        
        //User Input Questions
        System.out.println("Enter time step size: ");
        stepSize = input.nextDouble();
        
        System.out.println("Enter number of steps in simulation: ");
        numStep = input.nextDouble(); 
        
        //For Loop
        for (int i = 0; i < numStep; i++){
            time += stepSize;
            change = eString.findChange(stepSize);
            eString.makeChange(change);
        
            //System print out
            System.out.printf("at time = %3.1f", time);
            System.out.println(", positions = " + eString.getY());
        
        }
        
    }
    
}