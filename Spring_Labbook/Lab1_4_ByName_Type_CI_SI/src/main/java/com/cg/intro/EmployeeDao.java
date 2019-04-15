package com.cg.intro;

import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeDao {
	
	@Autowired
	private ECollection ecoll;

	public EmployeeDao(ECollection ecoll) {
		super();
		this.ecoll = ecoll;
	}

	public EmployeeDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ECollection getEcoll() {
		return ecoll;
	}

	public void setEcoll(ECollection ecoll) {
		this.ecoll = ecoll;
	}

	public void displayInfo(int a) {
		ecoll.displayInfo(a);
		
	}



}
