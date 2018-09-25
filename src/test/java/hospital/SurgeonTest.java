package hospital;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class SurgeonTest {
	
	@Test
	public void shouldHaveSalary() {
		//Arrange
		Surgeon underTest = new Surgeon("","","");
		//Act
		int salary = underTest.getSalary();
		//Assert
		Assert.assertEquals(120000,salary);
	}
	
	@Test
	public void shouldBeOperating() {
		//arrange
		Surgeon underTest = new Surgeon("","", "");
		//act
		underTest.toggleOperating();
		boolean result = underTest.isOperating();
		//assert
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void shouldNotOperating() {
		//arrange
		Surgeon underTest = new Surgeon("","", "");
		underTest.toggleOperating();
		underTest.toggleOperating();
		boolean result = underTest.isOperating();
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void shouldHaveSpecialty() {
		//arrange
		Surgeon underTest = new Surgeon("","", "hand");
		//act
		String result = underTest.getSpecialty();
		Assert.assertEquals("hand", result);
	}

	@Test
	public void shouldHaveNewSpecialty() {
		//arrange
		Surgeon underTest = new Surgeon("","","buttocks");
		//act
		String result = underTest.getSpecialty();
		Assert.assertEquals("buttocks", result);
	}
	
	@Test
	public void shouldHaveAName() {
		Surgeon underTest = new Surgeon("","Robert","buttocks");
		
		String result = underTest.getName();
		
		assertThat(result, is("Robert"));
	}
	
	@Test
	public void shouldHaveANameOtherThanRobertAnyOneElse() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		
		String result = underTest.getName();
		
		assertThat(result, is("Dr. Spaceman"));
	}
	@Test
	public void shouldDrawBlood() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		
		Patient bob = new Patient();
		underTest.drawBlood(bob);
		int result = bob.getBloodLevel();
		assertThat(result,is(equalTo(19)));
	}
	@Test
	public void shouldDrawMoreBlood() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		
		Patient bob = new Patient();
		underTest.drawBlood(bob);
		underTest.drawBlood(bob);
		int result = bob.getBloodLevel();
		assertThat(result,is(equalTo(18)));
	}
	@Test
	public void increasePatientHealth() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		
		Patient bob = new Patient();
		underTest.increasePatientHealth(bob);
		int result = bob.getHealthLevel();
		assertThat(result,is(equalTo(11)));
	}
	@Test
	public void increasePatientHealth2() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		
		Patient bob = new Patient(2);
		underTest.increasePatientHealth(bob);
		int result = bob.getHealthLevel();
		assertThat(result,is(equalTo(3)));
	}
	@Test
	public void shouldHaveAnEmployeeNumber() {
		Surgeon underTest = new Surgeon("Emp 1","Dr. Spaceman", "buttocks");
		String result = underTest.getEmployeeNumber();
		assertThat(result, is(equalTo("Emp 1")));
	}	
	@Test
	public void shouldHaveADifferentEmployeeNumber() {
		Surgeon underTest = new Surgeon("Emp 2","Dr. Spaceman", "buttocks");
		String result = underTest.getEmployeeNumber();
		assertThat(result, is(equalTo("Emp 2")));
	}

	
}
