package workplace;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	String name;
	int validAgeMid, invalidAgeLower, invalidAgeHigher, validAgeLower, validAgeHigher;
	Employee employee;

	@BeforeEach
	void setUp() throws Exception {

		name = "Valid Name";
		employee = new Employee();

		validAgeMid = 25;
		validAgeLower = 18;
		validAgeHigher = 30;

		invalidAgeHigher = 31;
		invalidAgeLower = 17;

	}

	@Test
	void testSetGetName() {

		employee.setName(name);
		assertEquals(name, employee.getName());

	}

	@Test
	void testSetGetAgeValid() {

		employee.setAge(validAgeLower);
		assertEquals(validAgeLower, employee.getAge());

		employee.setAge(validAgeMid);
		assertEquals(validAgeMid, employee.getAge());

		employee.setAge(validAgeHigher);
		assertEquals(validAgeHigher, employee.getAge());

	}

	@Test
	void testSetGetAgeInvalid() {

		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(invalidAgeLower);

		});

		assertEquals("INVALID AGE", e.getMessage());

		e = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(invalidAgeHigher);

		});

		assertEquals("INVALID AGE", e.getMessage());

	}
	
	@Test
	void constructorTestValid() {
		
		employee = new Employee(name, validAgeLower);
		assertEquals(validAgeLower, employee.getAge());
		
		employee = new Employee(name, validAgeMid);
		assertEquals(validAgeMid, employee.getAge());
		
		employee = new Employee(name, validAgeHigher);
		assertEquals(validAgeHigher, employee.getAge());
	}
	
	
	
	@Test
	void constructorTestInvalid() {
		
			assertThrows(IllegalArgumentException.class, ()->{
			employee = new Employee(name, invalidAgeLower);
			
		});
		
			assertThrows(IllegalArgumentException.class, ()->{
			employee = new Employee(name, invalidAgeHigher);
			
		});
		
		
	}  
	 
	
	
	
	
	
	
	
	
	
	
}
