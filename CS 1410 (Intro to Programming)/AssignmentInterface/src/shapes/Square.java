package shapes;

/**
 * this class creates a square with the length of its sides.
 * 
 * @author Jp
 *
 */
public class Square extends Rectangle implements Shape, Printable {

	public Square(int l) {
		super(l, l);
	}

	public int getSide() {
		return super.getLength();
	}

	@Override
	public String toString() {
		return "Square (" + super.getLength() + ")";
	}

	/**
	 * math function for perimeter
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (getSide() * 4);
	}

	/**
	 * math function for area
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (getSide() * getSide());
	}

	/**
	 * Prints out shape for my square
	 */
	@Override
	public void print() {
		for (int i = 0; i < getSide(); i++) {
			for (int j = 0; j < getSide(); j++) {
				if (j == 0 || j == getSide() - 1 || i == 0 || i == getSide() - 1)
					System.out.print(" o ");
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}