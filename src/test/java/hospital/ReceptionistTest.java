package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void shouldBeOnPhone() {
		OnPhone underTest = new Receptionist("Bob","",45000);
		boolean result = underTest.getPhoneStatus();
		assertThat(result, is(true));
	}
	
	@Test
	public void shouldBeOffPhone() {
		OnPhone underTest = new Receptionist("Bob","",45000);
		underTest.togglePhone();
		boolean result = underTest.getPhoneStatus();
		assertThat(result, is(false));
	}
}
