package searchingApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 *  Compilation:  javac LookupCSV.java
 *  Execution:    java LookupCSV file.csv keyField valField
 *  Dependencies: ST.java In.java StdIn.java StdOut.java
 *  Data files:   https://algs4.cs.princeton.edu/35applications/DJIA.csv
 *                https://algs4.cs.princeton.edu/35applications/UPC.csv
 *                https://algs4.cs.princeton.edu/35applications/amino.csv
 *                https://algs4.cs.princeton.edu/35applications/elements.csv
 *                https://algs4.cs.princeton.edu/35applications/ip.csv
 *                https://algs4.cs.princeton.edu/35applications/morse.csv
 *  
 *  Reads in a set of key-value pairs from a two-column CSV file
 *  specified on the command line; then, reads in keys from standard
 *  input and prints out corresponding values.
 * 
 *  % java LookupCSV amino.csv 0 3     % java LookupCSV ip.csv 0 1 
 *  TTA                                www.google.com 
 *  Leucine                            216.239.41.99 
 *  ABC                               
 *  Not found                          % java LookupCSV ip.csv 1 0 
 *  TCT                                216.239.41.99 
 *  Serine                             www.google.com 
 *                                 
 *  % java LookupCSV amino.csv 3 0     % java LookupCSV DJIA.csv 0 1 
 *  Glycine                            29-Oct-29 
 *  GGG                                252.38 
 *                                     20-Oct-87 
 *                                     1738.74
 *
 *
 ******************************************************************************/

/**
 * The {@code LookupCSV} class provides a data-driven client for reading in a
 * key-value pairs from a file; then, printing the values corresponding to the
 * keys found on standard input. Both keys and values are strings. The fields to
 * serve as the key and value are taken as command-line arguments.
 * <p>
 * For additional documentation, see
 * <a href="https://algs4.cs.princeton.edu/35applications">Section 3.5</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 * 
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class StocksApp {

	static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	// Do not instantiate.
	private StocksApp() {
	}

	public static void main(String[] args) throws ParseException{
		int keyField = 0;
		int valField = 4;
		BST<Date, Double> st = readInDataFromCSV(valField, fileName);

		// symbol table
		BST<Date, Double> st = readInDataFromCSV(valField, "Toyota.csv");
		BST<Date, Double> stopening = readInDataFromCSV(1, "Toyota.csv");

		Date s = formatter.parse("2012-03-12");
		Date t = formatter.parse("2015-03-12");
		System.out.println("Records Read: " + st.size());
		System.out.println("Closing price on " + formatter.format(s) + ": " + st.get(s));
		System.out.println("Closing price on " + formatter.format(t) + ": " + st.get(t));
		System.out.println("Least Recent price: " + st.get(st.min()));
		System.out.println("Most Recent price: " + st.get(st.max()));

		System.out.println("Most Recent price in 2005: " + st.get(st.ceiling(formatter.parse("200-01-01"))));
		
		
		private static BST<Date, Double> readInDataFromCSV(int valField, String stockFile)	throws ParseException{
			
			//Symbol Table
			BST<Date, Double> st = new BST<Date,Double>();
			
			// read in the data from csv file
			In in = new In(stockFile);
			int count = 0;
			while (in.hasNextLine()) {
				String line = in.readLine();
				String[] tokens = line.split(",");
				Date key = formatter.parse(tokens[0]);
				Double val = Double.parseDouble(tokens[valField]);
				st.put(key, val);
				count++;
		}
		

		}
	}
}