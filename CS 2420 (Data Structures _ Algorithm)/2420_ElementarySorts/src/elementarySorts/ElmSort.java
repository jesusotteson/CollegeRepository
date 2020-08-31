package elementarySorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElmSort implements Comparable<ElmSort> {

	/*
	 * My private variables
	 */
	private String ElementName;
	private String ElementCode;
	private int Weight;

	/*
	 * The variable constructors
	 */
	public ElmSort(String title, String author, int year) {
		this.ElementName = title;
		this.ElementCode = author;
		this.Weight = year;

	}

	/*
	 * These are my getters
	 */
	public String getElementName() {
		return ElementName;
	}

	public String getElementCode() {
		return ElementCode;
	}

	public int getWeight() {
		return Weight;
	}

	/*
	 * My toString that formats how the book information is displayed.
	 */
	@Override
	public String toString() {
		return ElementName + " , " + ElementCode + " (" + Weight + "lbs)";
	}

	/*
	 * This method reads the data from the cvs file and provides error messages
	 * based on if there was an error reading a file based on the format.
	 */
	public static List<ElmSort> getList(String f) {
		List<ElmSort> Elements = new ArrayList<>();
		int ElementNum = 0;
		File file = new File(f);

		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNext()) {
				String[] parts = input.nextLine().split(",");
				if (parts.length == 3) {
					ElmSort b = new ElmSort(parts[0], parts[1], Integer.parseInt(parts[2]));
					Elements.add(b);
					ElementNum++;
				} else {
					System.out.println(
							"Problem reading in " + Arrays.toString(parts).replace("[", "\"").replace("]", "\""));
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Number of Elements read in: " + ElementNum);

		return Elements;

	}

	@Override
	public int compareTo(ElmSort b) {
		return this.getElementName().compareTo(b.getElementName());
	}

}
