package Industry.employee.Dao;

import java.util.ArrayList;
import java.util.List;

import Industry.employee.Employee;

public class EmployeeDaoIMPL implements EmployeeDao{
	List<Employee> employees = new ArrayList<Employee>();
	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
		System.out.println("Employee has been added successfully");
	}

	@Override
	public void displayEmployee(Employee employee) {
		int flag = 0;
		Employee p=null;
		for(Employee pro : employees) {
			if(pro.getEmployeeId() == employee.getEmployeeId()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Employee has not found");
		}
		else {
			System.out.println(p);
		}
		
		
	}

	@Override
	public List<Employee> displayEmployee() {
		
		return employees;
	}

	@Override
	public List<Employee> displayEmployee(String employeeName) {
	
		List<Employee> pros = new ArrayList<Employee>();
		for(Employee pro : employees) {
			if(pro.getEmployeeName().equals(employeeName)) {
				pros.add(pro);
			}
		}
		return pros;
	
	}

	@Override
	public Employee displayEmployee(long employeeId) {
		
		int flag = 0;
		Employee p=new Employee();
		p.setEmployeeId(0);
		//System.out.println(productId);
		for(Employee pro : employees) {
			if(pro.getEmployeeId() == employeeId) {
				flag++;
				p = pro;
				break;
			}
		}
		
		return p;
	}

	@Override
	public void deleteEmployee(Employee employee) {
		int flag = 0;
		Employee p=null;
		for(Employee pro : employees) {
			if(pro.getEmployeeId() == employee.getEmployeeId()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Product has not found");
		}
		else {
			employees.remove(p);
		}
		
	}
		
	

	@Override
	public void updateEmployee(Employee employee) {
		int flag = 0;
		Employee p=null;
		for(Employee pro : employees) {
			if(pro.getEmployeeId() == employee.getEmployeeId()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Product has not found");
		}
		else {
			System.out.println(p);
		}
		
	}
	
	

}
