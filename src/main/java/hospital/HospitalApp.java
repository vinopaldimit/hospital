package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		
		hospital.addEmployee(new WitchDoctor("Garbage", "WD1", "necronancy", -1250000));
		hospital.addEmployee(new VampireJanitor("Vlad", "J1", 40000));
		hospital.addEmployee(new Surgeon("Killer" , "S1", "Eyes"));
		
		for(Employee employee: hospital.getEmployees() ) {
			System.out.println(employee);
			
		}
	}
}
