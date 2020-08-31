/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar;

import java.util.Scanner;

public class GuitarString {
    private double dampingFactor;
    private double oldY;
    private double currentY;
    
    //Constructor
    public GuitarString(){
    Scanner input = new Scanner(System.in);
        
        //User Inputs
        System.out.println("Enter damping factor: ");
        dampingFactor = input.nextDouble();
        
        System.out.println("Enter initial previous position: ");
        oldY = input.nextDouble();
        
        System.out.println("Enter initial current position: ");
        currentY = input.nextDouble();
    
    }
    //Method 1
    public double findChange(double stepSize){
        double dampingSign;
        double change; 
        change = (currentY - oldY) - currentY * stepSize *stepSize;
        
        if (currentY < 0)
            dampingSign = 1;
        else
            dampingSign = -1;
        
        change -= dampingSign * dampingFactor * change * change;
    
    return change;
    }
    //Method 2 (side note) void means no value
    public void makeChange(double change){
        oldY = currentY;
        currentY = change;
    }
    //Method 3
    public double getY(){
      
    return currentY;
    }
}
