package part1;

public class SoccerPlayer extends Athlete{
	/**
	 * These this is my string for the position
	 */
	String position;

	public String getPosition() {
		return position;
	}
	
	SoccerPlayer(String name, String Position){
		super(name);
		this.position = Position;
	}
	
	
	/**
	 * method for format
	 */
	public void headBall() {
		System.out.println("A " + position + " is heading the ball"); 
	}
	
	@Override
	public void pratice() {
		System.out.println("kicking the ball");
	}

}

