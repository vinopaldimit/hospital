package hospital;

public class Patient {
	// identifies constant for patient blood level
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;

	private int healthLevel;
	private int bloodLevel;
	private String patientName;
	private String patientNumber;

	public Patient(String patientNumber, String patientName) {
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}
	public Patient() {
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;

	}

	public Patient(int healthLevel) {
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = healthLevel;

	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public void reduceBlood() {
		bloodLevel -= 1;

	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void increaseHealth() {
		healthLevel += 1;

	}

	public void reduceBlood(int pintsOfBlood) {
		bloodLevel -= pintsOfBlood;
	}
	public String getPatientName() {
		
		return patientName;
	}
	@Override
	public String toString() {
		return "Patient ["", patientName=" + patientNamehealthLevel=" + healthLevel + ", bloodLevel=" + bloodLevel + "]";
	}
	public String getPatientNumber() {
		return patientNumber;
	}
	
	
	

}
