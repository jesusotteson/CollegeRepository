import java.util.Comparator;

public class Term implements Comparable<Term> {

	private String query;
	private double weight;

	// Initialize a term with the given query string and weight.
	public Term(String query, double weight) {
		if (query == null)
			throw new NullPointerException();
		if (weight < 0)
			throw new IllegalArgumentException();
		this.query = query;
		this.weight = weight;
	}

	// Compare the terms in descending order by weight.
	public static Comparator<Term> byReverseWeightOrder() {
		return new ComparatorReverseWeight();

	}

	// Compare the terms in lexicographic order but using only the first r
	// characters of each query.
	public static Comparator<Term> byPrefixOrder(int r) {
		if (r < 0)
			throw new IllegalArgumentException();
		return new ComparatorPrefix(r);

	}

	// Compare the terms in lexicographic order by query.
	public int compareTo(Term that) {
		return this.query.compareTo(that.query);

	}

	// Return a string representation of the term in the following format:
	// the weight, followed by a tab, followed by the query.
	public String toString() {
		return weight + "\t" + query;
	}

	// Comparator for weight reverse order
	private static class ComparatorReverseWeight implements Comparator<Term> {

		@Override
		public int compare(Term a, Term b) {
			if (a.weight == b.weight)
				return 0;
			if (a.weight > b.weight)
				return -1;
			return 1;
		}

	}

	private static class ComparatorPrefix implements Comparator<Term> {

		private int r;

		private ComparatorPrefix(int r) {
			this.r = r;
		}

		@Override
		public int compare(Term a, Term b) {

			String A;
			String B;

			if (a.query.length() < r)
				A = a.query;
			else
				A = a.query.substring(0, r);

			if (b.query.length() < r)
				B = b.query;
			else
				B = b.query.substring(0, r);

			return A.compareTo(B);

		}

	}

}
