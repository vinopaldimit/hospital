package hospital;

public class VampireJanitor extends Janitor implements DrawBlood {

	public VampireJanitor(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
	}

	@Override
	public void drawBlood(Patient subpatient) {
		subpatient.reduceBlood(10); 		
	}

}
