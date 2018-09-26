package hospital;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmergencyDispatcherTest {
	@Test
	public void shouldBeOffPhone() {
		EmergencyDispatcher underTest = new EmergencyDispatcher("Tina", "", 45000);
		boolean result = underTest.getPhoneStatus();
		assertThat(result, is(false));
	}
	
	@Test
	public void shouldBeOnPhone() {
		EmergencyDispatcher underTest = new EmergencyDispatcher("Tina", "", 45000);
		underTest.togglePhone();
		boolean result = underTest.getPhoneStatus();
		assertThat(result, is(true));
	}
	
	@Test
	public void shouldIncreasePatientHealth() {
		PatientCare underTest = new EmergencyDispatcher("Tina", "", 45000);
		Patient testPatient = new Patient();
		underTest.increasePatientHealth(testPatient);
		int result = testPatient.getHealthLevel();
		assertThat(result,is(equalTo(11)));
	}
	
	@Test
	public void shouldDispatch() {
		EmergencyDispatcher underTest = new EmergencyDispatcher("Tina", "", 45000);
		underTest.toggleDispatch();
		boolean result = underTest.getDispatchStatus();
		assertThat(result, is(true));
	}
	
}
