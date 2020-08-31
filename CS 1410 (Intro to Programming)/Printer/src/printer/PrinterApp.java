package printer;

public class PrinterApp {
	
	static int i;
	public static void main(String[] args) {
		InkjetPrinter iPrinter = new InkjetPrinter(1234567);
		LaserPrinter lPrinter = new LaserPrinter(2345678);

		System.out.println(iPrinter);
		System.out.println("Remaining Cartridge: " + iPrinter.getRemainingCartridge() + "%");

		System.out.println(lPrinter);
		System.out.println("Remaining Toner: " + lPrinter.getRemainingToner() + "%");

		System.out.println();
		System.out.println("List of Printers:");
		Printer printers[] = { iPrinter, lPrinter };
		for (Printer p : printers) {
			System.out.println(p);
			for (i=0; i<11; i++) {
			p.print();
			}
		}
	}

}
