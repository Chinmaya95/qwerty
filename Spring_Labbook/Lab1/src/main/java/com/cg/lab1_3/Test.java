package com.cg.lab1_3;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  

public class Test {  
   public static void main(String[] args) {  
         
       Resource r=new ClassPathResource("applicationContext.xml");  
       BeanFactory factory=new XmlBeanFactory(r);  
         
       SBU sbu=(SBU)factory.getBean("h");  
       sbu.show();

   }  
}  