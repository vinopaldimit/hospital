package hospital;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VampireJanitorTest {

	
	@Test 
	public void shouldDrawBlood() {
		DrawBlood underTest = new VampireJanitor(null, null, 0);
		Patient bob = new Patient();
		underTest.drawBlood(bob);
		int result = bob.getBloodLevel();
		assertThat(result,is(equalTo(10)));
		
	}
}
