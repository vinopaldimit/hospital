package hospital;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	@Test
	public void shouldHavePatientNumber() {
		Nurse underTest = new Nurse("Mack", "N1", 3);
		int result = underTest.getPatientNumber();
		assertThat(result, is(equalTo(3)));
	}
	
	@Test
	public void shouldDrawBlood() {
		DrawBlood underTest = new Nurse("Mack", "N1", 3);
		Patient testPatient = new Patient();
		underTest.drawBlood(testPatient);
		int result = testPatient.getBloodLevel();
		assertThat(result, is(equalTo(19)));
	}
	
	@Test
	public void shouldCareForPatient() {
		PatientCare underTest = new Nurse("Emp 2","Dr. Spaceman", 2);
		
		Patient bob = new Patient();
		underTest.increasePatientHealth(bob);
		int result = bob.getHealthLevel();
		assertThat(result,is(equalTo(11)));
	}
}
