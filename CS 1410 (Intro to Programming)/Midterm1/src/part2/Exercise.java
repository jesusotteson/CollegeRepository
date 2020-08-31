package part2;

public class Exercise {
	public static void main(String[] args) {

		String[] painters = {"Monet", "Dega", "Renoir"};
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome Mr.");
		
		int numPainters = 0;
		
		for (String paint : painters) {
			if (numPainters == painters.length - 1) {
				sb.append(paint).append(".");
			} else {
				sb.append(paint).append(", Mr. ");
			}
			numPainters++;
		}
		System.out.println(sb);

	}

}
