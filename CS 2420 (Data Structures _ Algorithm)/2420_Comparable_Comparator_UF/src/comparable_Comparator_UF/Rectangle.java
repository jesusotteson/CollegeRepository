package comparable_Comparator_UF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle implements Comparable<Rectangle> {
	
	Double width;
	Double height;
	
	public Rectangle(Double w, Double h) {
		
		width = w;
		height = h;
	}
	
	public int compareTo(Rectangle r) {
		
		int diag1 = (int) Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
		int diag2 = (int) Math.sqrt(Math.pow(r.width, 2) + Math.pow(r.height, 2));
		return diag1 - diag2;
	}
	
	public static void main(String args[]) {
		
		List<Rectangle> Rects = new ArrayList<Rectangle>();
		Rects.add(new Rectangle(5.2,6.3));
		Rects.add(new Rectangle(6.2,7.3));
		Rects.add(new Rectangle(7.2,8.3));
		Rects.add(new Rectangle(8.2,9.3));
		Rects.add(new Rectangle(9.2,1.3));
		
		Collections.sort (Rects);
		System.out.println(Rects);
	}

	@Override
	public String toString() {
		return "|Width: " + width + ", Height: " + height + "| ";
	}
}
