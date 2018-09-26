package hospital;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	private String name;
	private String employeeNumber;
	private int salary;
	private Map <String, Patient> assignedPatients = new HashMap<>();

	public Employee(String name, String employeeNumber, int salary) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeNumber=" + employeeNumber + ", salary=" + salary + "]";
	}

	public void assignPatient() {
		
		
	}

}