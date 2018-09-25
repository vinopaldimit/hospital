package hospital;

public abstract class Doctor {

	protected String name;
	protected String specialty;
	protected String employeeNumber;
	private int salary;

	public Doctor(String employeeNumber, String name, String specialty) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.specialty = specialty;
		this.salary = 90000;
	}

	public Doctor(String employeeNumber, String name, String specialty, int salary) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.specialty = specialty;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String getSpecialty() {
	
		
		return specialty;
	}

	public String getName() {
		
		return name;
	}

	public void drawBlood(Patient subpatient) {
		subpatient.reduceBlood(); 		
	}
	
	public void increasePatientHealth(Patient bob) {
		bob.increaseHealth();	
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

}