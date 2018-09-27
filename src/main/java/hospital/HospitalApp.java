package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		
		hospital.addEmployee(new WitchDoctor("Garbage", "WD1", "necromancy", -1250000));
		hospital.addEmployee(new VampireJanitor("Vlad", "J1", 40000));
		hospital.addEmployee(new Surgeon("Killer" , "S1", "Eyes"));
		hospital.addEmployee(new Nurse("May", "N1", 3));
		hospital.addEmployee(new EmergencyDispatcher("Tina", "ED1", 45000));
		hospital.addEmployee(new Receptionist("Mark", "R1", 45000));
		hospital.addEmployee(new Surgeon("Phil", "S2", "Brain"));
		hospital.addEmployee(new Surgeon("Harry", "S3", "Plastic"));
		hospital.addEmployee(new Nurse("Jackie", "N2", 0));
		hospital.addEmployee(new Receptionist("Janine", "R2", 45000));
		hospital.addEmployee(new Janitor("Rosie", "J2", 40000));
		
		hospital.addPatient(new Patient("1", "JimBob"));
		hospital.addPatient(new Patient("2", "KimBob"));
		hospital.addPatient(new Patient("3", "TimBob"));
		hospital.addPatient(new Patient("4", "JimBean"));
		hospital.addPatient(new Patient("5", "JimBeana"));
		
		for(Employee employee: hospital.getEmployees() ) {
			System.out.println(employee);
		}
		
		System.out.println("");
		
		for(Patient patient: hospital.getPatients()) {
			System.out.println(patient);
		}
			
		System.out.println("\nThese employees can draw blood:");
		for(Employee employee : hospital.getEmployees()) {
			if(employee instanceof DrawBlood) {
				System.out.println((DrawBlood)employee);
			}
		}
		
	}
}
