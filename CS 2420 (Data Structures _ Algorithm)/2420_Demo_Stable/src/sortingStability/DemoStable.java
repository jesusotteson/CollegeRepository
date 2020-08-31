package sortingStability;

import java.util.ArrayList;
import java.util.Collections;

public class DemoStable {

	public static void main(String[] args) {

		ArrayList <Rectangle> al1=new ArrayList <Rectangle>();
		al1.addAll(new Rectangle (4,2));
		al1.add(new Rectangle (3,5));
		al1.add(new Rectangle (4,3));
		al1.add(new Rectangle (6,2));
		al1.add(new Rectangle (3,4));
		al1.add(new Rectangle (4,4));
		al1.add(new Rectangle (6,4));
		al1.add(new Rectangle (12,2));
		al1.add(new Rectangle (2,4));
		al1.add(new Rectangle (4,6));
		al1.add(new Rectangle (2,12));
		System.out.println("rectangles          :" + al1);
		
		System.out.println();
		Collections.sort(al1, Rectangle.BY_Length);
		System.out.println("sorted by length    :" + al1);
	}

}
