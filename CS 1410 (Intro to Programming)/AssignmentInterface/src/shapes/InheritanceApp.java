package shapes;

/**
 * 
 * @author Jp
 *
 *         This is the App that runs the program
 */
public class InheritanceApp {
	/**
	 * This main method creates an array for all the classes in this program to
	 * communicate with.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 4);
		Square square = new Square(4);
		IsoscelesRightTriangle irt = new IsoscelesRightTriangle(5);
		Circle cir = new Circle(4);
		/**
		 * This print statements create the desired output for the user to read.
		 */
		System.out.println(rect);
		System.out.println("Length: " + rect.getLength());
		System.out.println("Width: " + rect.getWidth());
		System.out.println();

		System.out.println(square);
		System.out.println("Side: " + square.getSide());
		System.out.println();

		System.out.println(irt);
		System.out.println("Leg: " + irt.getLeg());
		System.out.printf("%s%1.1f\n ", "Hypotenuse: ", irt.hypotenuse());
		System.out.println(); 

		System.out.println(cir);
		System.out.printf("%s%d\n", "Diameter: ", cir.diameter());
		System.out.printf("%s%1.1f\n", "Circumference: ", cir.circumference());
		System.out.printf("%s%d\n", "Radius: ", cir.getRadius());
		System.out.println();

		Rectangle rectangle2 = square;
		System.out.println("rectangle2:");
		System.out.println("----------");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getWidth());
		System.out.println();

		System.out.println("Rectangle Array:");
		System.out.println("---------------");
		Rectangle[] rectangles = { rectangle2, square, rect };
		for (Rectangle r : rectangles) {
			System.out.println(r);
			System.out.println("Length: " + r.getLength());
			System.out.println("Width: " + r.getWidth());
			System.out.println();

		}

	}
}
