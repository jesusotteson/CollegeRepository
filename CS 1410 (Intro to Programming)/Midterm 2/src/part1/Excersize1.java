package part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excersize1 {
	
	public static void main(String[] args) {
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		System.out.println("Vowel List: " + vowels);
		
		char searchItem = 'x';
		
		if (vowels.contains(searchItem)) {
			System.out.println("The letter x is included in the list");
		} else {
			System.out.println("The letter x is not included in the list");
		}
		
		Collections.reverse(vowels);
		System.out.println("Vowel List Reversed: " + vowels);
		
		Collections.shuffle(vowels);
		System.out.println("Vowel List Randomized: " + vowels);
		
		
		Collections.replaceAll(vowels, new Character('a'), new Character('x'));
		Collections.replaceAll(vowels, new Character('e'), new Character('x'));
		Collections.replaceAll(vowels, new Character('i'), new Character('x'));
		Collections.replaceAll(vowels, new Character('o'), new Character('x'));
		Collections.replaceAll(vowels, new Character('u'), new Character('x'));
		System.out.println("New and improved Vowel List: " + vowels);
		
	}

}
