package com.cg.lab1_3;



public class Employee {  
private int employeeId;  
private String employeeName;
private Double salary;



public void show() {
	System.out.println("Employee Details\n----------------\nEmployee ID:"+employeeId+
			"\nEmployee Name:"+employeeName
			+"\nEmployee Salary:"+salary);
	
}



public int getEmployeeId() {
	return employeeId;
}



public Employee(int employeeId, String employeeName, Double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
}



public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}



public String getEmployeeName() {
	return employeeName;
}



public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}



public Double getSalary() {
	return salary;
}



public void setSalary(Double salary) {
	this.salary = salary;
}



@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
}



}  