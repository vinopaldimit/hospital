package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();
	Map<String, Patient> patients = new HashMap<>();
	
	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeNumber(), employee);
		
	}

	public Collection<Employee> getEmployees() {
		
		return employees.values();
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientName(), patient);
	}

	public Collection<Patient> getPatients() {
		return patients.values();
	}

	public void removeEmployee(String fired) {
		employees.remove(fired);
	}
	

}
