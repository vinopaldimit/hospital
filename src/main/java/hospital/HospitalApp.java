package hospital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Scanner in = new Scanner(System.in);
		
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
		
		String input;
		do {
			System.out.println("\n1 - List Employees\n2 - List Patients\n3 - See Draw Blood\n4 - See Patient care\n5 - Search Employee\n6 - Fire employee\n7 - Add Employee\n8 - Quit");

			input = in.nextLine();
			switch(input){
			case "1":
				printEmployees(hospital);
				break;
			case "2": 
				printPatients(hospital);
				break;
			case "3":
				checkDrawBlood(hospital);
				break;
			case "4":
				checkPatientCare(hospital);
				break;
			case "5":
				searchEmployee(hospital, in);
				break;
			case "6":
				fireEmployee(hospital, in);
				break;
			case "7":
				
				break;
			case "8":
				System.out.println("Bye!");
				break;
			default:
				System.out.println("That is not an option.");
				break;
			}
		}while(!input.equals("8"));
		
		in.close();
		
	}

	private static void fireEmployee(Hospital hospital, Scanner in) {
		System.out.println("\nEnter the number of the employee you would like to fire:");
		String fireName = in.nextLine();
		hospital.removeEmployee(fireName);
	}

	private static void searchEmployee(Hospital hospital, Scanner in) {
		System.out.println("\nEnter the employee name:");
		String searchName = in.nextLine();
		for(Employee employee: hospital.getEmployees() ) {
			if(employee.getName().equals(searchName)) {
				System.out.println(employee);
			}
		}
	}

	private static void checkPatientCare(Hospital hospital) {
		System.out.println("\nThese employees can care for patients:");
		for(Employee employee : hospital.getEmployees()) {
			if(employee instanceof PatientCare) {
				System.out.println((PatientCare)employee);
			}
		}
	}

	private static void checkDrawBlood(Hospital hospital) {
		System.out.println("\nThese employees can draw blood:");
		for(Employee employee : hospital.getEmployees()) {
			if(employee instanceof DrawBlood) {
				System.out.println((DrawBlood)employee);
			}
		}
	}

	private static void printPatients(Hospital hospital) {
		System.out.println("\nThese are the patients:");
		for(Patient patient: hospital.getPatients()) {
			System.out.println(patient);
		}
	}

	private static void printEmployees(Hospital hospital) {
		System.out.println("\nThese are the employees:");
		for(Employee employee: hospital.getEmployees() ) {
			System.out.println(employee);
		}
	}
}
