package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cg.bean.Trainee;
import com.cg.bean.user;




@Repository
public class TraineeDaoimpl implements TraineeDao {


	
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	
	@Override
	public boolean updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		entitymanager.merge(trainee);
		entitymanager.flush();
		return true;

	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		TypedQuery<Trainee> query = entitymanager.createQuery("SELECT d FROM Trainee d", Trainee.class);
		return query.getResultList();
		
		
	}

	@Override
	public Boolean validateUser(user u) {
		// TODO Auto-generated method stub
		TypedQuery<user> query = entitymanager.createQuery("SELECT d FROM user d", user.class);
		List<user> list1=query.getResultList();
		for (user user : list1) {
			if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public void addTrainee(Trainee trainee) {
		entitymanager.persist(trainee);
		entitymanager.flush();

	}

	@Override
	public Trainee getTraineeById(int id) {
		// TODO Auto-generated method stub
		return entitymanager.find(Trainee.class,id);
		
		
	}

	@Override
	public boolean deleteTrainee(int id) {
		// TODO Auto-generated method stub
		try {
		Trainee tr=entitymanager.find(Trainee.class,id);
		entitymanager.remove(tr);
		return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		

	}


}
