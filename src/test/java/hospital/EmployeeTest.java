package hospital;

import org.junit.Test;

public class EmployeeTest {
@Test
public void shouldAssignPatientToEmployee() {
	Employee underTest = new Employee(null, null, 0);
	underTest.assignPatient();
	
}
}
