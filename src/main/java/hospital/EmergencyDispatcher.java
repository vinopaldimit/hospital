package hospital;

public class EmergencyDispatcher extends Employee implements PatientCare, OnPhone {

	private boolean onPhone;
	private boolean dispatching;

	public EmergencyDispatcher(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
		onPhone = false;
		dispatching = false;
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
	public void increasePatientHealth(Patient patient) {
		patient.increaseHealth();
	}

	public void toggleDispatch() {
		dispatching = !dispatching;
	}

	public boolean getDispatchStatus() {
		return dispatching;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() +  ", onPhone=" + onPhone + ", dispatching=" + dispatching + "]";
	}
	
	
}
