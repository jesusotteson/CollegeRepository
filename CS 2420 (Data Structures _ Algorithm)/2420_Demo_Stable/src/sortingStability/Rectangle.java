package sortingStability;

import java.util.Comparator;


public class Rectangle implements Comparable<Rectangle> {

	private static int length;
	private static int width;
	
	public static final Comparator BY_Length = new CompareByLength();
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	public int perimeter() {
		return length*2 + width*2;
	}
	
	public int area() {
		return length * width;
	}
	
	private static class CompareByLength implements Comparator<Rectangle>{
		@Override
		public int compare(Rectangle length, Rectangle width) {
			int l1 = Rectangle.length;
			int l2 = Rectangle.length;
			return (int) (l1 - l2);
		}
	}
	
	
	@Override
	public String toString() {
		return ("[" + this.length + "x" + this.width +"]");
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return (int) (l1 - l2)
	}
	
}
