/*
 * Jesus Otteson
 * Assignment Books
 */

package books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Book implements Comparable<Book> {

	/*
	 * My private variables
	 */
	private String title;
	private String author;
	private int year;

	public static final Comparator BY_AUTHOR = new AuthorComparator();
	public static final Comparator BY_YEAR = new YearComparator();

	/*
	 * The variable constructors
	 */
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;

	}

	/*
	 * These are my getters
	 */
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}


	/*
	 * My toString that formats how the book information is displayed.
	 */
	@Override
	public String toString() {
		return title + " by " + author + " (" + year + ")";
	}

	/*
	 * This method reads the data from the cvs file and provides error messages
	 * based on if there was an error reading a file based on the format.
	 */
	
	private static class YearComparator implements Comparator<Book> {
		@Override
		public int compare(Book o1, Book o2) {
			int w1 = o1.getYear();
			int w2 = o2.getYear();

			return (int) (w1 - w2);
		}
	}

	private static class AuthorComparator implements Comparator<Book> {
		@Override
		public int compare(Book o1, Book o2) {
			String author1 = o1.getAuthor();
			String author2 = o2.getAuthor();

			return author1.compareTo(author2);
		}
	}
	
	public static List<Book> getList(String f) {
		List<Book> books = new ArrayList<>();
		int bookNum = 0;
		File file = new File(f);

		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNext()) {
				String[] parts = input.nextLine().split(",");
				if (parts.length == 3) {
					Book b = new Book(parts[0], parts[1], Integer.parseInt(parts[2]));
					books.add(b);
					bookNum++;
				} else {
					System.out.println(
							"Problem reading in " + Arrays.toString(parts).replace("[", "\"").replace("]", "\""));
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Number of books read in: " + bookNum);

		return books;

	}

	@Override
	public int compareTo(Book b) {
		return this.getTitle().compareTo(b.getTitle());
	}

}
