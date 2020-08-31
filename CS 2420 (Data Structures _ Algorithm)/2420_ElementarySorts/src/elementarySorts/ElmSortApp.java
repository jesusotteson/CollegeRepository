package elementarySorts;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * The BookApp runs my main method to locate the books.csv file with the list of books and
 * organizes them first in alphabetical order and then in reversed alphabetical order.
 */
public class ElmSortApp {

	public static void main(String[] args) {
		List<ElmSort> b = ElmSort.getList("src/elementarySorts/Elements.csv");

		System.out.println();

		/*
		 * This sorts the list of books in alphabetical order using Collections.sort.
		 */
		System.out.println("Sorted book list:");
		Collections.sort(b);
		for (ElmSort book : b) {
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
		for (ElmSort book : b) {
			System.out.println(book.toString());
		}
	}

}
