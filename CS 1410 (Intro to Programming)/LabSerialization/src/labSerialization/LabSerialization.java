package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
	
	private static ListVsSetDemo deserialize(String filename) {
		
		ListVsSetDemo returnObject = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));) {
			
			returnObject = (ListVsSetDemo) in.readObject();
			
		}catch(IOException e) {
			System.out.println("File Error: " + e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Error: " + e.getMessage());
		} 
		return returnObject; 
	}
	
	private static void serialize(ListVsSetDemo demo, String filename){
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));) {
		 out.writeObject(demo);
		 System.out.println("Complete");
		
		} catch(IOException e) {
			System.out.println("File Error: " + e.getMessage());
			
		}
	}
	
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

//        testDemo(demo);
        serialize(demo, "src/labSerialization/Demo.ser");
       ListVsSetDemo newDemo = deserialize ("src/labSerialization/Demo.ser");
       testDemo(newDemo); 

    };

    private static void testDemo(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }

}
