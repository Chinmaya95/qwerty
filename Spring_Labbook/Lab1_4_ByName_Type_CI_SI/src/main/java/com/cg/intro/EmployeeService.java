package com.cg.intro;

import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeService {
	@Autowired
	private EmployeeDao eDao;

	public EmployeeDao geteDao() {
		return eDao;
	}

	public void seteDao(EmployeeDao eDao) {
		this.eDao = eDao;
	}

	public EmployeeService(EmployeeDao eDao) {
		super();
		this.eDao = eDao;
	}

	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void displayInfo(int a) {
		eDao.displayInfo(a);
		
	}
	
}
