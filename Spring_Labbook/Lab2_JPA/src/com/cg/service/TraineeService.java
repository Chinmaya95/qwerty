package com.cg.service;

import java.util.List;

import com.cg.bean.Trainee;
import com.cg.bean.user;


public interface TraineeService {
	 public void addTrainee(Trainee trainee);
	public Trainee getTraineeById(int id);
	public boolean deleteTrainee(int id);
	public boolean updateTrainee(Trainee trainee);
	List<Trainee> getAllTrainees();
	public Boolean validate(user u);
}

