package timeTable;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class labTimesTable {

	public static void main(String[] args) {
		PrintTimesTable();
	}
		
		public static void PrintTimesTable() {
			try (Formatter writer = new Formatter("TimeTables.txt" )){
				 writer.format("Time Tables: \n \n");
				for (int i = 1; i <= 10; i += 2) {
					
					for (int j = 1; j <= 10; j++) {
						writer.format("%2d * %d = %d\t\t%2d * %d = %d\n", j, i, (j*i), j, (i+1), (j*(i+1)));
					}
					writer.format("\n");
				} System.out.println("File Created");
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found");
			}

	}

}