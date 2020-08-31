package part1;

public class AthleteApp {

	public static void main(String[] args) {
/**
 * athlete in program
 */
		Athlete rn = new Athlete("Rafael Nadal");
        SoccerPlayer m = new SoccerPlayer("Lionel Messi", "Forward");
        BaseballPlayer tw = new BaseballPlayer("Ted Williams", 0.344);
		
	        Athlete[] ath = { rn, m, tw };
		/**
		 * creates the for loop to print out the headball for soccer player
		 */
		for (Athlete a : ath) {
			if (a instanceof SoccerPlayer) {
				System.out.println(a);
				((SoccerPlayer) a).headBall();
				System.out.println();
			} actAsAthlete(a);
		}
	}

	private static void actAsAthlete(Athlete a) {
		 System.out.println(a);
	}
}
