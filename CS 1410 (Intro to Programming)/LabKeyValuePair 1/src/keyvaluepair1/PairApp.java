package keyvaluepair1;

public class PairApp {

	public static void main(String[] args) {

		KeyValuePair<String, Integer> p1 = new KeyValuePair <>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair <>("NYC", 8244910);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals (p2): " +p1.equals(p2));
		
		p1 = p2;
		System.out.println();

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals (p2): " +p1.equals(p2));
	}

}
