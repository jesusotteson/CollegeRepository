package part1;

public class BaseballPlayer extends Athlete {
/**
 * double for batting avg
 */
	private double battingAvg;
/**
 * 
 * method to calculate batting avg
 */
	public BaseballPlayer(String name, double battingAvg) {
		super(name);
		this.battingAvg = battingAvg;
	}

	public double getbattingAvg() {
		return battingAvg;
	}

	/**
	 * override for format
	 */
	@Override
	public void pratice() {
		System.out.println("hitting the ball");
	}
}
