package shapes;

/**
 * This class creates the rectangle that allows other classes to reference this
 * one.
 * 
 * @author Jp
 *
 */
public class Rectangle implements Shape, Printable {
	private int length;
	private int width;

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle (" + getLength() + "x" + getWidth() + ")";
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2 * getLength()) + (2 * getWidth());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getLength() * getWidth();
	}

	/**
	 * Prints out shape for my rectangle
	 */
	public void print() {
		for (int i = 0; i < getWidth(); i++) {
			System.out.print("o ");
			for (int j = 0; j < getLength() - 2; j++) {

				if (i == 0 || i == getWidth() - 1) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("o ");
			System.out.println();
		}
	}

}
