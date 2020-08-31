package shapes;

/**
 * this class creates an isosceles right triangle with the length of its leg.
 * 
 * @author Jp
 *
 */
public class IsoscelesRightTriangle implements Shape, Printable {

	private int leg;

	public IsoscelesRightTriangle(int l) {
		leg = l;
	}

	public double hypotenuse() {
		double h = Math.hypot(getLeg(), getLeg());
		return h;
	}

	int getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + getLeg() + ")";
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (getLeg() * 2) + Math.hypot(getLeg(), getLeg());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (getLeg() * getLeg()) / 2;
	}
	/**
	 * Prints out shape for Isosceles Right Triangle
	 */

	@Override
	public void print() {

		for (int i = 1; i <= getLeg(); i++) {

			for (int j = 1; j <= i; j++) {

				if (i == 1 || i == getLeg()) {
					System.out.print("o ");
				} else if (j == 1 || j == getLeg()) {
					System.out.print("o ");
				} else if (j == i) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}
}
