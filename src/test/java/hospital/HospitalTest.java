package hospital;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {

	@Test
	
	public void shouldReturnAListOfEmployee() {
		Hospital underTest = new Hospital();
		Employee testJanitor = new Janitor("Jean", "24601", 40000 ); 
		underTest.addEmployee(testJanitor);
		Collection <Employee> result = underTest.getEmployees();
		assertThat(result, contains(testJanitor));
	}
	
	
}
