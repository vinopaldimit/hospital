package hospital;

public class Receptionist extends Employee implements OnPhone {

	private boolean onPhone;

	public Receptionist(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
		onPhone = true;
	}

	@Override
	public boolean getPhoneStatus() {
		return onPhone;
	}

	@Override
	public void togglePhone() {
		onPhone = !onPhone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() +  ", onPhone=" + onPhone + "]";

	}

}
