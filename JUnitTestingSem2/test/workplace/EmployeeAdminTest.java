package workplace;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeAdminTest {

	Employee e1, e2, e3;
	ArrayList<Employee> employees;
	
 
	@BeforeEach
	void setUp() throws Exception {
 
		// create three employees
		e1 = new Employee("E1 Name", 29);
		e2 = new Employee("E2 Name", 23);
		e3 = new Employee("E3 Name", 21);
 
		// Create list of employees
		employees = new ArrayList<Employee>();
 
		// Add employees to list
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
 
	}
 
	@Test
	public void testEmployeeAgeSearch() {
 
		int searchLimit = 25;
 
		ArrayList<Employee> returnedSearchByAge = EmployeeAdmin.getAllEmployeesByAge(employees, searchLimit);
 
		// should return two employees
		System.out.println(returnedSearchByAge.size());
 
		if (returnedSearchByAge.size() == 2 && returnedSearchByAge.contains(e2) && returnedSearchByAge.contains(e3)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
 
		// or
//		assertTrue(returnedSearchByAge.size()==2 && returnedSearchByAge.contains(e2) && returnedSearchByAge.contains(e3));		   
	}
}
