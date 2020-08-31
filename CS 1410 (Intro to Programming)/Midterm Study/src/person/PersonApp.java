package person;

public class PersonApp {
	public static void main(String[] args) {
		
		Address add = new Address("Main Street 123", 84532, "Hometown", "UT");
		
		Person pers = new Person("Tara", "Rice", add);
		
		Address updateAdd = new Address("Main Street 123", 84532, "Moab", "UT");
		
		Person updatePers = new Person ("Tara", "Rice", updateAdd);
		
		System.out.println(pers);
		System.out.println(updatePers);
	}
	
}
 