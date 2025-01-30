package workplace;

public class Employee {

	// Constants for business rule boundaries
	private static final int AGE_VALID_LOWER = 18;
	private static final int AGE_VALID_UPPER = 30;

	private String name;
	private int age;

	/**
	 * Default constructor
	 */
	public Employee() {

	}

	/**
	 * Constructs an employee with arguments
	 * 
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age) throws IllegalArgumentException {

		this.name = name;
		this.setAge(age); // linking constructor with business rule
	}

	/**
	 * Gets the age
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age within valid range : {@value #AGE_VALID_LOWER} -
	 * {@value #AGE_VALID_UPPER}
	 * 
	 * @param age
	 * @throws IllegalArgumentException with invalid age set attempt
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age >= AGE_VALID_LOWER && age <= AGE_VALID_UPPER) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("INVALID AGE");
		}
	}

	/**
	 * Gets the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;  
	}
} 
