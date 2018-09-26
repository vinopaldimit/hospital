package hospital;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class WitchDoctorTest {

	@Test
	public void shouldHaveSalary() {
		// Arrange
		Doctor underTest = new WitchDoctor("", "", "", 90000);
		// Act
		int salary = underTest.getSalary();
		// Assert
		Assert.assertEquals(90000, salary);
	}

	@Test
	public void shouldHaveSpecialty() {
		// arrange
		Doctor underTest = new WitchDoctor("", "", "general",0);
		// act
		String result = underTest.getSpecialty();
		Assert.assertEquals("general", result);
	}

	@Test
	public void shouldHaveAName() {
		Doctor underTest = new WitchDoctor("Robert", "", "voodoo" ,0);

		String result = underTest.getName();

		assertThat(result, is("Robert"));
	}
	@Test
	public void shouldHaveAlternativeSpecialty() {
		//arrange
		Doctor underTest = new WitchDoctor("","", "voodoo", 0);
		//act
		String result = underTest.getSpecialty();
		Assert.assertEquals("voodoo", result);
	}
	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new WitchDoctor("Emp 2","Dr. Spaceman", "voodoo" , 0);
		
		Patient bob = new Patient();
		underTest.drawBlood(bob);
		int result = bob.getBloodLevel();
		assertThat(result,is(equalTo(0)));
	}
	@Test
	public void increasePatientHealth() {
		PatientCare underTest = new WitchDoctor("Emp 2","Dr. Spaceman", "buttocks" , 0);
		
		Patient bob = new Patient();
		underTest.increasePatientHealth(bob);
		int result = bob.getHealthLevel();
		assertThat(result,is(equalTo(11)));
	}
}
