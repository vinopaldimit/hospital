package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();
	
	public void addEmployee(Employee testJanitor) {
		employees.put(testJanitor.getEmployeeNumber(), testJanitor);
		
	}

	public Collection<Employee> getEmployees() {
		
		return employees.values();
	}
	

}
