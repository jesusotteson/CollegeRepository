import java.util.Comparator;

public class BinarySearchDeluxe {

	// Return the index of the first key in a[] that equals the search key, or -1 if
	// no such key.
	public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator) {

		if (a == null || key == null || comparator == null)
			throw new NullPointerException();

		int lo = 0;
    	int hi = a.length -1;
    	if(comparator.compare(a[0], key)==0) return 0;
		while(lo <= hi){
			int mid = lo+(hi-lo)/2;
			if (comparator.compare(key, a[mid]) < 0) hi = mid - 1;
    		else if (comparator.compare(key, a[mid]) > 0) lo = mid + 1;
    		else if (comparator.compare(a[mid - 1], a[mid]) == 0) hi = mid - 1;
    		else return mid;
		}
		return -1;
	}

	// Return the index of the last key in a[] that equals the search key, or -1 if
	// no such key.
	public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator) {

		if (a == null || key == null || comparator == null)
			throw new NullPointerException();

		int lo = 0;
    	int hi = a.length - 1;
    	if (comparator.compare(a[hi], key) == 0) return hi;
    	while (lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if (comparator.compare(key, a[mid]) < 0) hi = mid - 1;
    		else if (comparator.compare(key, a[mid]) > 0) lo = mid + 1;
    		else if (comparator.compare(a[mid + 1], a[mid]) == 0) lo = mid + 1;
    		else return mid;
    	}
		return -1;
	}
}
