package hospital;

import org.junit.Assert;
import org.junit.Test;

public class WitchDoctorTest {

	@Test
	public void shouldHaveSalary() {
		//Arrange
		WitchDoctor underTest = new WitchDoctor("","");
		//Act
		int salary = underTest.getSalary();
		//Assert
		Assert.assertEquals(90000,salary);
	}
	@Test
	public void shouldHaveSpecialty() {
		//arrange
		WitchDoctor underTest = new WitchDoctor("","");
		//act
		String result = underTest.getSpecialty();
		Assert.assertEquals("general", result);
	}
	
}
