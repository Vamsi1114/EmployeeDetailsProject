package Industry.employee;

public class Employee {
	
	private long employeeId;
	private String employeeName,employeeCategory;
	private double employeeSalary;
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCategory() {
		return employeeCategory;
	}

	public void setEmployeeCategory(String employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public Employee() {
		
	}

	public Employee(long employeeId, String employeeName, String employeeCategory, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCategory = employeeCategory;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [ EmployeeId=" + employeeId + ", EmployeeName=" + employeeName + ", EmployeeCategory="
				+ employeeCategory + ", EmployeeSalary=" + employeeSalary + "]";
	}


}
