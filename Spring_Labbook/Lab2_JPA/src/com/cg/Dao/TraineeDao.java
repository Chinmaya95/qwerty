package com.cg.Dao;

import java.util.List;

import com.cg.bean.Trainee;
import com.cg.bean.user;

public interface TraineeDao {
	public void addTrainee(Trainee trainee);
	public Trainee getTraineeById(int id);
	public boolean deleteTrainee(int id);
	public boolean updateTrainee(Trainee trainee);
	List<Trainee> getAllTrainees();
	public Boolean validateUser(user u);
}
