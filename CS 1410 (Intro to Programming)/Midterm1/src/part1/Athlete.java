package part1;
/**
 * 
 * @author Jp
 *
 */
public class Athlete {
/**
 * These this is my string for my class name to be presented
 */
	private String name;
	String className = this.getClass().getSimpleName();
/**
 * Methods to create the name
 */
	public Athlete (String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public void pratice() {
		System.out.println("practicing");
	}
/**
 * Override for format
 */
	@Override
	public String toString() {
		return className + ": " + name + "\npracticing\n";
	}
}
