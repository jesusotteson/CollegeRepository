/* Jp Otteson
Road Use Model
*/
package roadusesurvey;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.*;

public class RoadUseModel {
    //Variables
        String[] county;
        double[] useProfile;
 
    //Methods
    //Zero-parameter Constructor
    public RoadUseModel(){
        Scanner scnr = new Scanner(System.in);
        int numCounties;
        String countyName;
        double numCars;
        double sum = 0;
        //ask for # of counties
            System.out.println("How many counties would you like to input? ");
            numCounties = scnr.nextInt();
           county = new String[numCounties];
           useProfile = new double[numCounties];
            //for each county, prompt/read county name & #
            for (int i = 0; i < numCounties; i++){
                System.out.println("Enter a county name and fraction: ");
                countyName = scnr.next();
                numCars = scnr.nextDouble();
                //sum cumulative #
                sum = sum + numCars;
                useProfile[i] = sum;
            } 
            for (int i=0; i<numCounties; i++){
                System.out.println(useProfile[i] + " " + county[i]);
            }
        }  //end of constructor

    //Save Method
        static void saveFile(String fileName, int numOfSamples){
            String countyName;
            PrintWriter pw = null;
            try{
            //instantiate PrintWriter with filename
                pw = new PrintWriter(fileName);
            } 
            
            catch(FileNotFoundException e){
                System.out.println(e.getMessage());
            }
                    for(int i=0; i < numOfSamples; i++){
                        pw.println(getRandomCounty());
                    }
                pw.close();
            }
            
    //getRandomCounty()
    private String getRandomCounty(){
                    int j = 0;        
                //pick random county name for output
                //select random number
                double random = Math.random();
                    //find smallest cumulative use value that is less than random number
                    //j loop
                    for (j=0; j < useProfile.length && useProfile [j] < random;j++){       
                    }   
                    //print out county, county[j]
                    
                    return county[j];//retunr to county
                    //println(county[j]);
            }
    
    public void main(){
        //Variables
        String fileName;
        int numSamples;
        Scanner scnr = new Scanner(System.in);
        //make a RoadUseModel object
        RoadUseModel modelA =  new RoadUseModel();
        //prompt for file name
        System.out.println("Enter file name: ");
        fileName = scnr.next();
        //prompt for total number of samples
        System.out.println("Enter total number of samples: ");
        numSamples = scnr.nextInt();
        modelA.saveFile(fileName, numSamples);
    }
}
