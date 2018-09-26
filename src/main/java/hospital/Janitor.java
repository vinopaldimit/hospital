package hospital;

public class Janitor extends Employee {

	private boolean sweeping;
	public Janitor(String name, String employeeNumber, int salary) {
		super(name, employeeNumber,salary);
		this.sweeping = false;
	
	}

	public boolean isSweeping() {
		return sweeping;
	}

	public void toggleSweeping() {
		sweeping = !sweeping; 
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() + ", sweeping=" + sweeping +  "]";
	}


}
