package com.cg.lab1_1;



public class Employee {  
private int employeeId;  
private String employeeName;
private Double salary;
private String businessUnit;
private int age;

public Employee(int employeeId, String employeeName, Double salary, String businessUnit, int age) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.businessUnit = businessUnit;
	this.age = age;
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
public String getBusinessUnit() {
	return businessUnit;
}
public void setBusinessUnit(String businessUnit) {
	this.businessUnit = businessUnit;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void show() {
	System.out.println("Employee Details\n----------------\nEmployee ID:"+employeeId+
			"\nEmployee Name:"+employeeName
			+"\nEmployee Salary:"+salary
			+"\nEmployee BU:"+businessUnit
			+"\nEmployee Age:"+age);
	
}
  

}  