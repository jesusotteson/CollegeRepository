package person;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address a) {
		this.address = a;
	}

	public Person (String fName, String lName, Address a) {
		this.firstName = fName;
		this.lastName = lName;
		this.address = a;
	}
	
	public String getFirstName() {
		return this.firstName;
		
		
	}

	public String getLastName() {
		return this.lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + address;
	}
}
