package printer;

public class LaserPrinter extends Printer {
	private int remainingToner;

	public LaserPrinter(int sNumber) {
		super(sNumber);
		remainingToner = 100;
	}

	public int getRemainingToner() {
		return remainingToner;
	}

	public void print() {
		if (getRemainingToner() > 0) {
			remainingToner -= 10;

			System.out.println("LaserPrinter is printing. remaining toner is " + getRemainingToner() + "%");

		} else if (getRemainingToner() == 0) {

			System.out.println("LaserPrinter is printing. remaining toner is " + getRemainingToner() + "%");
			System.out.println("Toner is Empty");
		}
	}
}
