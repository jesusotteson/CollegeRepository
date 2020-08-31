package labCoin;

public enum Coin {
	PENNY(19.05, 2.5), NICKEL(21.21, 5), DIME(17.91, 2.26), QUARTER(24.26, 5.76);
	
	private final double diameter;
	private final double weight;
	
	@Override
	public String toString() {
		String returnValue = super.toString() + 
				String.format(" w:%.1f d:%.1f", weight, diameter);
		return returnValue;
	}
	
	private Coin (double d, double w){
		diameter = d;
		weight = w;
	}

}
