package comparable_Comparator_UF;

import java.util.ArrayList;
import java.util.Collections;

public class StringInsen {
	
	private static String[] TheStrings = {"Some", "Strings", "are", "long", "and", "some", "Are", "shoRT","BuT","I","LikE",
			"A", "strING","Of","Wins"};
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> ArrayList CaseInsensitive (E[] list) {
		ArrayList Sorted = new ArrayList();
		for (E item : list) {
			Sorted.add(item);
		}
		Collections.sort(Sorted, String.CASE_INSENSITIVE_ORDER);
		return Sorted;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T> ArrayList CaseSensitive (T[] list) {
		ArrayList Sorted = new ArrayList();
		for (T item : list) {
			Sorted.add(item);
		}
		Collections.sort(Sorted);
		return Sorted;
	}

	public static void main(String[] args) {
		StringInsen ReadString = new StringInsen();
		@SuppressWarnings("rawtypes")
		ArrayList Sorted = ReadString.CaseInsensitive(TheStrings);
		for (int i = 0; i < Sorted.size(); i++) {
			System.out.println(Sorted.get(i)+ " ");
		}
		System.out.println();
		@SuppressWarnings("rawtypes")
		ArrayList InSorted = ReadString.CaseSensitive(TheStrings);
		for (int i = 0; i < InSorted.size(); i++) {
			System.out.println(InSorted.get(i) + " ");
		}

	}

}
