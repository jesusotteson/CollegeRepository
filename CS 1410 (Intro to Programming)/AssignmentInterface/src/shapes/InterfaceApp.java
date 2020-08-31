package shapes;

public class InterfaceApp {

	public static void main(String[] args) {

		/**
		 * Array that organizes my classes and gives them values
		 */
		Shape[] shape = { new Rectangle(6, 3), new Rectangle(5, 4), new Square(4), new Square(3),
				new IsoscelesRightTriangle(5), new IsoscelesRightTriangle(3), new Circle(7), new Circle(2)

		};

		/**
		 * Prints out my results for each of my classes
		 */
		System.out.println("Shape Array");
		System.out.println("-------------");

		for (Shape s : shape) {

			if (s instanceof Printable) {
				System.out.println(s);
				System.out.printf("%s%1.1f\n", "Perimeter: ", s.perimeter());
				System.out.printf("%s%1.1f\n", "Area: ", s.area());
				((Printable) s).print();
				System.out.println();

			} else {
				System.out.println(s);
				System.out.printf("%s%1.1f\n", "Perimeter: ", s.perimeter());
				System.out.printf("%s%1.1f\n", "Area: ", s.area());
				System.out.println();

			}
		}

	}
}
