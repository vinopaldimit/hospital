package hospital;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

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
	
	@Test
	public void shouldReturnPatientList () {
		Hospital underTest = new Hospital();
		Patient testPatient = new Patient("","");
		underTest.addPatient(testPatient);
		Collection <Patient> result = underTest.getPatients();
		assertThat(result, contains(testPatient));
		
		
	}
	
	
}
