package printer;

public abstract class Printer {

	private int serialNumber;

	public Printer(int number) {
		serialNumber = number;
	}

	public abstract void print();

	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + " #" + serialNumber;
	}
}
