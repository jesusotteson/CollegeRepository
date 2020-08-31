/*Jesus Otteson 
 * HVAC Program
 */
package hvacload;

import java.util.Scanner;
        
public class HVACLoad {

    public static void main(String[] args) {
        //constants
          final double WINTER_INDOOR_TEMP = 72.0;
          final double SUMMER_INDOOR_TEMP = 76.0;
          final double HUMIDITY = 0.01;
          final double SOLAR_LOAD = 193.0;
        //Variable for equations
          double roofArea = 1500.0;
          double buildingPerimeter = 140.0;
          double buildingHeight = 18.0;
          double totalwindowArea = 400.0;
          double westwindowArea = 80.0;
          double roofUvalue = 0.04;
          double wallUvalue = 0.1;
          double windowUvalue = 0.5;
          double winterOutdoortemp = 2.00;
          double summerOutdoortemp = 100.00;
          double summerOutdoorhum = 0.013;
          double infiltrationCFM = 200.0;
          double peoplePresent = 3;
          double electricalWatts = 1500.0;
          
          //Heating Load
            //Equations defining the area and temperture differences
          double winterTempdiff = WINTER_INDOOR_TEMP - winterOutdoortemp;
          double netWallarea = buildingPerimeter * buildingHeight - totalwindowArea;
            //Equations needed for the total heating load calculation     
          double roofLoad = roofArea * roofUvalue * winterTempdiff;
          double windowLoad = totalwindowArea * windowUvalue * winterTempdiff;
          double wallLoad = netWallarea * wallUvalue * winterTempdiff;
          double infiltrationLoad = infiltrationCFM * winterTempdiff * 1.08;
            //Total heating load equation
          double totalHeatingLoad = (roofLoad * 1.3) + (windowLoad * 1.3) + (wallLoad * 1.3) + (infiltrationLoad * 1.3);
                  
          //Cooling Load
            //Equations defining the summer temperature difference and humidity
          double summerTempdiff = summerOutdoortemp - SUMMER_INDOOR_TEMP;
          double summerHumdiff = summerOutdoorhum - HUMIDITY;
            //Equations needed for the total cooling load calculation
          double roofLoadcool = roofArea * roofUvalue * summerTempdiff;
          double windowLoadcool = totalwindowArea * windowUvalue * summerTempdiff;
          double wallLoadcool = netWallarea * wallUvalue * summerTempdiff;
          double infiltrationLoadcool = infiltrationCFM * 1.08 * summerTempdiff;
          double solarLoad = SOLAR_LOAD * westwindowArea;
          double electricalLoadcool = 3.416 * electricalWatts;
          double peopletempLoad = 250.0 * peoplePresent;
          double infiltrationhumidityLoad = infiltrationCFM * 4675.0 * summerHumdiff;
          double peoplehumLoad = 200.0 * peoplePresent;
            //Total cooling load equation
          double totalCoolingLoad = (roofLoadcool * 1.1) + (windowLoadcool * 1.1) + (wallLoadcool * 1.1) + (infiltrationLoadcool * 1.1) + (electricalLoadcool * 1.1) + (solarLoad * 1.1) + (peopletempLoad * 1.1) + (infiltrationhumidityLoad * 1.1) + (peoplehumLoad * 1.1);
            //Code that prints out the final results 
          System.out.println("Heating Load = " + totalHeatingLoad + " per hour");
          System.out.println("Cooling Load = " + totalCoolingLoad + " per hour");
    }
    
}
