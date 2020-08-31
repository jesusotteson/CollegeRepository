/* Jp Otteson
Road Use Model
*/
package roadusesurvey;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RoadUseSurvey {

    ArrayList data = new ArrayList();
    ArrayList County = new ArrayList();
    int[] countyNum;
    String countyName;
    int[] frequency;
            
    public void RoadUseAnalysis(String file){
            //Variables
            FileInputStream fileinput = null;
            Scanner scnr = null;
            try{
                fileinput = new FileInputStream(file);
                
                scnr = new Scanner(fileinput);
                    
                    while(scnr.hasNext()){
                        countyName = scnr.nextLine();
                        data.add(countyName);
                        
                        if (County.indexOf(countyName) < 0){
                          County.add(countyName);
                        }
                    }
                    scnr.close();
            }  catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
            countyNum = new int[County.size()];
            for(int i = 0; i < data.size(); i++){
                countyNum[County.indexOf(data.get(i))]++;
            }        
            //go thru data + count each county
            for(int i = 0; i < data.size(); i++){
               County.indexOf(data.get(i));
               
               frequency[County.indexOf(data[i])]++;
            }
    }
    
    for(i=0; i<frequency; i++){
       countyName += "*";
       System.out.print("*");
    }
    
}
