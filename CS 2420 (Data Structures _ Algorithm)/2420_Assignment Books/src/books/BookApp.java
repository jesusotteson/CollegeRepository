/*
 * Jesus Otteson
 * Assignment Books
 */

package books;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * The BookApp runs my main method to locate the books.csv file with the list of books and
 * organizes them first in alphabetical order and then in reversed alphabetical order.
 */
public class BookApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Book> b = Book.getList("src/books/books.csv");

		System.out.println();

		/*
		 * This sorts the list of books in alphabetical order using Collections.sort.
		 */
		System.out.println("Sorted book list:");
		Collections.sort(b);
		for (Book book : b) {
			System.out.println(book.toString());
		}
		/*
		 * This sorts the list of books in reverse alphabetical order using
		 * Collections.reverseOrder.
		 */
		Comparator<Object> c = Collections.reverseOrder();
		Collections.sort(b, c);
		System.out.println();

		System.out.println("Reverse order:");
		for (Book book : b) {
			System.out.println(book.toString());
		}
		
		//New addition
		System.out.println();
		Collections.sort(b, Book.BY_AUTHOR);
		System.out.println("Ordered by Author:" + b);
		
		System.out.println();
		 Collections.sort(b, Book.BY_YEAR);
		System.out.println("Ordered by Year:" + b);
	}

}
