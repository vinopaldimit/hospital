package hospital;

public class Surgeon extends Doctor {
	private boolean operating;

	public Surgeon(String employeeNumber, String name, String specialty) {
		super(employeeNumber, name, specialty, 120000);
		operating = false;
	}

	public boolean isOperating() {
		return operating;
	}

	public void toggleOperating() {
		operating = !operating;
	}

}
