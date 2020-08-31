package stringAndStringBuilder;

public class RoundTrip {
	public static void main(String[] args) {
		
		String[] cities = {"Berlin", "Weimar", "Heidelberg", "Muenchen"};
		
		System.out.print( "From " + cities[0] + " to ");
		System.out.print( cities[1] + " to ");
		System.out.print( cities[2] + " to ");
		System.out.print( cities[3] + " and back to ");
		System.out.print( cities[0] + ".");
	}
}
