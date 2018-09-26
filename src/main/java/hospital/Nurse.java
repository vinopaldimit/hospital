package hospital;

public class Nurse extends Employee implements DrawBlood, PatientCare {

	private int patientNumber;

	public Nurse(String name, String employeeNumber, int patientNumber) {
		super(name, employeeNumber, 50000);
		this.patientNumber = patientNumber;
	}

	public int getPatientNumber() {
		return patientNumber;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.reduceBlood();
	}

	@Override
	public void increasePatientHealth(Patient patient) {
		patient.increaseHealth();
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() +  ", patientNumber=" + patientNumber + "]";
	}

}
