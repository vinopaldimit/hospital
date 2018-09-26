package hospital;

public class WitchDoctor extends Doctor {

	public WitchDoctor(String name, String employeeNumber,  String specialty, int salary) {
		super(name, employeeNumber, specialty, salary);
	}
	
	@Override
	public void drawBlood(Patient patient) {
		patient.reduceBlood(20);
	}

}
