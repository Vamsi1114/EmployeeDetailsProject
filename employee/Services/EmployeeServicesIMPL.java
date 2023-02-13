package Industry.employee.Services;
import Industry.employee.*;
import Industry.employee.Dao.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeServicesIMPL implements EmployeeServives{

	private long employeeId = 101;
	Scanner scan = new Scanner(System.in);
	EmployeeDaoIMPL dao = new EmployeeDaoIMPL();
	@Override
	public void addEmployee() {
		
		System.out.println("Enter the Employee Name ");
		String pname = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Employee Category");
		String cat = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Employee Salary");
		double pcost = scan.nextDouble();
		
		//Add details to the Employee object
		Employee p = new Employee();
		
		p.setEmployeeCategory(cat);
		p.setEmployeeSalary(pcost);
		p.setEmployeeId(employeeId);
		p.setEmployeeName(pname);
		
		//Add product to the Employees list in DAO class
		dao.addEmployee(p);
		
		//Increase Employee Id
		employeeId++;
		
		
	}

	@Override
	public void displayEmployeeById() {
		System.out.println("Enter the Employee ID");
		long eid = scan.nextLong();
		//scan.nextLine();
		Employee p = dao.displayEmployee(eid);
		if(p.getEmployeeId() == 0) {
			System.out.println("Sorry Employee has not found");
		}
		else {
			dao.displayEmployee(p);
		}
		
	}

	@Override
	public void displayAllEmployees() {
		List<Employee> employees = dao.displayEmployee();
		for(Employee pro : employees) {
			dao.displayEmployee(pro);
		}
		
	}

	@Override
	public void displayEmployeeByName() {
		
		System.out.println("Enter the Employee name ");
		String pname = scan.nextLine();
		scan.nextLine();
		List<Employee> employees = dao.displayEmployee(pname);
		for(Employee pro : employees) {
			dao.displayEmployee(pro);
		}
		
		
	}

	@Override
	public void updateEmployee() {
		
		System.out.println("Enter the Employee ID");
		long pid = scan.nextLong();
		//scan.nextLine();
		Employee p = dao.displayEmployee(pid);
		if(p.getEmployeeId() != 0) {
			int choice;
			do {
						System.out.println("What you want to update ?");
						System.out.println("1.Employee Salary");
						System.out.println("2.Employee Name");
						System.out.println("3.Employee Category");
						System.out.println("4.Show Employees list and Exit");
						Scanner sc = new Scanner(System.in);
						 choice =  sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter new Salary of the Employee:");
							int a = sc.nextInt();
							p.setEmployeeSalary(a);
							System.out.println("Salary updated Sucessfully!!");
							System.out.println(p.toString());
							break;
						case 2:
							System.out.println("Enter new Name of the Employee:");
							String b = sc.next();
							p.setEmployeeName(b);
							System.out.println("Name Updated Sucessfully!!");
							System.out.println(p.toString());
							break;
						case 3:
							System.out.println("Enter new Category of the Employee:");
							String c = sc.next();
							p.setEmployeeCategory(c);
							System.out.println("Category Updated sucessdully!!");
							System.out.println(p.toString());
							break;
						case 4:
							displayAllEmployees();
							System.out.println("Everything is updated. Thankyou!!");
							break;
						default:
							System.err.println("Sorry!! Please select the relevant Option");
							break;
				}	
			} while (choice!=4);	
		}
		else {
			System.out.println(p);
		}
	}
	

	@Override
	public void deleteEmployee() {
		System.out.println("Enter the Employee ID you want Delete");
		long eid = scan.nextLong();
		//scan.nextLine();
		Employee p = dao.displayEmployee(eid);
		if(p.getEmployeeId() == 0) {
			System.out.println("Sorry Employee has not found");
		}
		else {
			dao.deleteEmployee(p);
			System.out.println("Deleted Successfully");
			
		}
		
	}
		
	

	@Override
	public void menu() {
		while(true) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Employe Details<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("Press 1 for Add New Employee");
			System.out.println("Press 2 for Display All Available Employees");
			System.out.println("Press 3 for Display Employee By ID");
			System.out.println("Press 4 for Display Employee By Name");
			System.out.println("Press 5 for Update Employee By ID");
			System.out.println("Press 6 for Delete Employee By ID");
			System.out.println("Press 0 for Exit");
			System.out.println("Please Enter your choice ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 0 : System.exit(choice);
			case 1 : addEmployee();break;
			case 2 : displayAllEmployees();break;
			case 3 : displayEmployeeById();break;
			case 4 : displayEmployeeByName();break;
			case 5 : updateEmployee();break;
			case 6 : deleteEmployee();break;
			
			default : System.out.println("Sorry!!!! You have entered a wrong choice...");
			}
		}

	
		
	}
	
	

}
