package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.TraineeDao;
import com.cg.bean.Trainee;
import com.cg.bean.user;

@Service
@Transactional
public class TraineeServiceimpl implements TraineeService {
	@Autowired
	TraineeDao tdao;
	@Override
	public void addTrainee(Trainee trainee) {
		tdao.addTrainee(trainee);
		
		
	}

	@Override
	public Trainee getTraineeById(int id) {
		// TODO Auto-generated method stub
		return tdao.getTraineeById(id);
	}

	@Override
	public boolean deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return tdao.deleteTrainee(id);

	}

	@Override
	public boolean updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return tdao.updateTrainee(trainee);

	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return tdao.getAllTrainees();
	}

	@Override
	public Boolean validate(user u) {
		// TODO Auto-generated method stub
		
		return tdao.validateUser(u);
	}

}
