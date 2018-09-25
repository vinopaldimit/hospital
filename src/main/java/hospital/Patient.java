package hospital;

public class Patient {
	// identifies constant for patient blood level
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;

	private int healthLevel;
	private int bloodLevel;
	
	public Patient () {
	this.bloodLevel = BLOOD_LEVEL;
	this.healthLevel = HEALTH_LEVEL;
	
	}
	public Patient (int healthLevel) {
	this.bloodLevel = BLOOD_LEVEL;
	this.healthLevel = healthLevel;
	
	}	
	
	
	public int getBloodLevel() {
		return bloodLevel;
			}



	public void reduceBlood() {
		bloodLevel --; 
		
	}



	public int getHealthLevel() {
		// TODO Auto-generated method stub
		return healthLevel;
	}
	public void increaseHealth() {
		healthLevel ++;
		
	}
	public void reduceBlood(int pintsOfBlood) {
	bloodLevel -= pintsOfBlood;
	}
	
	

}
