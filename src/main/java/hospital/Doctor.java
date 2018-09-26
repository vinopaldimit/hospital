package hospital;

public abstract class Doctor extends Employee implements DrawBlood, PatientCare{

	
	private String specialty;

	public Doctor(String name, String employeeNumber, String specialty, int salary) {
		super(name, employeeNumber, salary);
		this.specialty = specialty;
		
	}

	public String getSpecialty() {
	
		
		return specialty;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.reduceBlood(); 		
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary() +  ", specialty=" + specialty +"]";
	}

	@Override
	public void increasePatientHealth(Patient patient) {
		patient.increaseHealth();	
	}

}