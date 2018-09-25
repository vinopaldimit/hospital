package hospital;

public class WitchDoctor extends Doctor {

	public WitchDoctor(String employeeNumber, String name, String specialty) {
		super(employeeNumber, name, specialty);
	}
	
	@Override
	public void drawBlood(Patient bob) {
		bob.reduceBlood(20);
	}

}
