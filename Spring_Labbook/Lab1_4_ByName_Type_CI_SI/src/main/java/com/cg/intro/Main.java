package com.cg.intro;
import java.util.Scanner;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Main {

	public static void main(String args[]) throws Exception {
		System.out.println("choose 1 for ByName.xml\nchoose 2 for ByType.xml\nchoose 3 for ConstructorInjection.xml\nchoose 4 for SetterInjection.xml\n");
		int choice= new Scanner(System.in).nextInt();
		Resource res =new ClassPathResource("ByType.xml"); ;
		 switch (choice) { 
	        case 1: 
	        	 res =new ClassPathResource("ByName.xml");
	            break; 
	        case 2: 
	        	 res =new ClassPathResource("ByType.xml");
	            break; 
	        case 3: 
	        	res =new ClassPathResource("ConstructorInjection.xml");
	        	break; 
	        case 4: 
	        	res =new ClassPathResource("ByType.xml"); 
	            break; 
	       
	        default: 
	           System.out.println("enter corect choice::RE-START");
	            break; 
	        } 
	
		BeanFactory factory = new XmlBeanFactory(res);
		 //BeanFactory factory=new XmlBeanFactory(r);  
	      
		EmployeeService q=(EmployeeService)factory.getBean("eService");  
		    System.out.println("Enter Emp Id");
		    int a= new Scanner(System.in).nextInt();
		    
		    q.displayInfo(a);  
	}
}
