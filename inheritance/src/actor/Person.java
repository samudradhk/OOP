package actor;

public abstract class Person {
	protected String name;
	protected String dob;
	
	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}
}
