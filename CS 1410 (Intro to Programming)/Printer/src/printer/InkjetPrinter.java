package printer;

public class InkjetPrinter extends Printer {
	
	private int remainingCartridge;

	public InkjetPrinter(int sNumber) {
		super(sNumber);
		remainingCartridge = 100;
	}

	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	public void print() {
		if (getRemainingCartridge() > 0) {
			remainingCartridge -= 10;
			
			System.out.println("InkJetPrinter is printing. remaining cartridge is " + getRemainingCartridge() + "%");
		
		} else if (getRemainingCartridge() == 0) {
			
			System.out.println("InkJetPrinter is printing. remaining cartidge is " + getRemainingCartridge() + "%");
			System.out.println("Cartridge is Empty");
		}
	}

}
