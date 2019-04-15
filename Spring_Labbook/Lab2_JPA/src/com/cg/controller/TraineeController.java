package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.Trainee;
import com.cg.bean.user;
import com.cg.service.TraineeService;


@Controller
public class TraineeController {
	@Autowired
	TraineeService tservice;
	
	
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public String saveTrainee(int id,String name,String domain,String location) {
		Trainee tr=new Trainee(id, name, domain, location);
		
		tservice.addTrainee(tr);
		return "success";
	}
	
	
	@RequestMapping(value="/gettrainee" ,method=RequestMethod.POST)
	public String getTrainee(int id,Model m) {
		
		Trainee tr=tservice.getTraineeById(id);
		m.addAttribute("trainee", tr);
		return "getTrainee";
	}
	
	@RequestMapping(value="/delete" ,method=RequestMethod.POST)
	public String removeTrainee(int id,Model m) {
	
		try {
			tservice.deleteTrainee(id);
			m.addAttribute("msg", "Deleted Successfully");
			return "success";
		} catch (Exception e) {
			m.addAttribute("go", "success.jsp");
			m.addAttribute("msg", "No Trainee With id :"+id+" was found");
			return "error";
		}
		
			
			
		
			
		
	}
	
	
	@RequestMapping(value="/getmodification" ,method=RequestMethod.POST)
	public String getTraineetoModify(int id,Model m) {
		
		Trainee tr=tservice.getTraineeById(id);
		m.addAttribute("trainee", tr);
		return "modifyTrainee";
	}
	
	
	
	
	@RequestMapping(value = "/validation", method = RequestMethod.POST)
	public String checkLogin(String user, String pwd, Model m) {
		user u=new user(user, pwd);
		if (tservice.validate(u)) {

			return "success";
		} else {
			m.addAttribute("go", "login.jsp");
			return "error";
		}

	}
	
	
	@RequestMapping("/all")
	public String all(Model m) {

		List<Trainee> lis = tservice.getAllTrainees();
		if (!lis.isEmpty()) {
			m.addAttribute("trainee", lis);
			return "allTrainee";
		} else {
			m.addAttribute("msg", "No Record Found");
			m.addAttribute("go", "success.jsp");
			return "error";
		}

	}
	
	
	
	
	@RequestMapping(value = "/modification", method = RequestMethod.POST)
	public String modifyTrainee(int id, String name, String location, String domain, Model m) {
		Trainee tr = new Trainee();
		tr.setTraineeId(id);
		tr.setTraineeName(name);
		tr.setTraineeLocation(location);
		tr.setTraineeDomain(domain);
		if (tservice.updateTrainee(tr)) {
			m.addAttribute("msg", "Updation SuccessFull");
			return "success";
		} else {
			m.addAttribute("go", "success.jsp");
			return "error";
		}

	}
	
	
}

  