package labFile;

import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class MountainApp {
	private static int lineCounter = 0;
	
	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<>();
		try(Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))){
			while (reader.hasNextLine()){
				lineCounter += 1;
				Mountain newMountain = getMountain(reader.nextLine());
				if(newMountain !=null) {
					mountainList.add(newMountain);
				}
			}
		}catch (NullPointerException e) {
			System.out.println("I've got nada, sorry, Try Again!");
		}
		for (Mountain el : mountainList) {
			System.out.println(el);
		}
	}
	private static Mountain getMountain(String nextLine) {
		Mountain jeffsMountain = null;
		
		try {
		String[] parts = nextLine.split(",");
		int alt = Integer.parseInt(parts[1]);
		boolean glac = Boolean.parseBoolean(parts[2]);
		jeffsMountain = new Mountain(parts[0], alt, glac);
		return jeffsMountain;
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println(nextLine + "\n ...this is not a mountain I can read, \n I'm a computer, give me something I can read.\n (Line: " + lineCounter + ") \n");
		}
		return jeffsMountain;
	}
}
