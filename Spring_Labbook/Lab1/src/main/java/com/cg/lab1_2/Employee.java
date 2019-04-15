package com.cg.lab1_2;



public class Employee {  
private int employeeId;  
private String employeeName;
private Double salary;
private SBU businessUnit;


public void show() {
	System.out.println("Employee Details\n----------------\nEmployee ID:"+employeeId+
			"\nEmployee Name:"+employeeName
			+"\nEmployee Salary:"+salary
			+"\nEmployee BU:"+businessUnit);
	
}


public Employee(int employeeId, String employeeName, Double salary, SBU businessUnit) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.businessUnit = businessUnit;
}


public int getEmployeeId() {
	return employeeId;
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


public SBU getBusinessUnit() {
	return businessUnit;
}


public void setBusinessUnit(SBU businessUnit) {
	this.businessUnit = businessUnit;
}
  
public SBU getSBUdetails()
{
return businessUnit;	
}

}  