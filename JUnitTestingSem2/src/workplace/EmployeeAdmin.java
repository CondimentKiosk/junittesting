/**
 * 
 */
package workplace;

import java.util.ArrayList;

/**
 * 
 */
public class EmployeeAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}
	
	/**
	 *
	 * Returns a list of employees who are below and equal to the passed age
	 *
	 * @param employees
	 * @param age
	 * @return
	 */
	public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age){
		ArrayList<Employee> employeesBelowSearchAge = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if(employee.getAge()<=age) {
				employeesBelowSearchAge.add(employee);
			}
		}
		return employeesBelowSearchAge;
	}
 
}

