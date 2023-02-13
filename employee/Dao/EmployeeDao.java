package Industry.employee.Dao;

import java.util.List;

import Industry.employee.Employee;


public interface EmployeeDao {

	public void addEmployee(Employee employee);
	public void displayEmployee(Employee employee);
	public List<Employee> displayEmployee();
	public List<Employee> displayEmployee(String employeeName);
	public Employee displayEmployee(long employeeId);
	public void deleteEmployee(Employee employee);
	public void updateEmployee(Employee employee);

}
