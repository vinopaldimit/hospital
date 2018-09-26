package hospital;

public class Surgeon extends Doctor {
	private boolean operating;

	public Surgeon(String name ,String employeeNumber, String specialty) {
		super(name,employeeNumber, specialty, 120000);
		operating = false;
	}

	public boolean isOperating() {
		return operating;
	}

	public void toggleOperating() {
		operating = !operating;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() +  ", specialty=" + getSpecialty() + ", operating=" + operating + "]";

	}

}
