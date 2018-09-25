package hospital;

public class Surgeon {
	private boolean operating;
	private String specialty;
	private String name;
	private String employeeNumber;

	public Surgeon(String empnbr, String name, String specialty) {
		operating = false;
		this.specialty = specialty;
		this.name = name;
		this.employeeNumber = empnbr;
	}

	public int getSalary() {
		return 120000;
	}

	public boolean isOperating() {
		return operating;
	}

	public void toggleOperating() {
		operating = !operating;
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
