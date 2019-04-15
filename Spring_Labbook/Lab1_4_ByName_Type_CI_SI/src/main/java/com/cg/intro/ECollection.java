package com.cg.intro;
import java.util.Iterator;
import java.util.List;

  
public class ECollection {  
 

private List<Employee> eMap;

public ECollection(List<Employee> eMap) {
	
	this.eMap = eMap;
}

public void displayInfo(int a) {
	System.out.println(eMap.get(a));
	
}

public List<Employee> geteMap() {
	return eMap;
}

public void seteMap(List<Employee> eMap) {
	this.eMap = eMap;
}

public ECollection() {
	super();
	// TODO Auto-generated constructor stub
}




  
  
 
}  
