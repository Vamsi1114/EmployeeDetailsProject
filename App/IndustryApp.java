package Industry.App;

import Industry.employee.Services.EmployeeServicesIMPL;
import Industry.employee.Services.EmployeeServives;

public class IndustryApp {
	
	public static void main(String[] args) {
		EmployeeServives service = new EmployeeServicesIMPL();
		service.menu();
	}

}
