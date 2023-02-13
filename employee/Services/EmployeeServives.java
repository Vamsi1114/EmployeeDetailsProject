package Industry.employee.Services;
import Industry.employee.*;
import Industry.employee.Dao.*;
public interface EmployeeServives {
	
	public abstract void addEmployee();
	public void displayEmployeeById();
	public void displayAllEmployees();
	public void displayEmployeeByName();
	public void updateEmployee();
	public void deleteEmployee();
	public void menu();
	

}
