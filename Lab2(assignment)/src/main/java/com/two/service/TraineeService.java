package com.two.service;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.two.dao.TraineeDao;
import com.two.entity.Trainee;


@Service
@Transactional
public class TraineeService {

	@Autowired
	private TraineeDao traineeDao;

	public Trainee addtrainee(Trainee trainee) {

		return traineeDao.save(trainee);

	}
	
	public List<Trainee> retrieve(){
		List<Trainee> trainees = new ArrayList<Trainee>();
		for(Trainee trainee : traineeDao.findAll()) {
			trainees.add(trainee);
		}
		
		return trainees;
	}

	public void deletetrainee(int traineeid) {

		traineeDao.deleteById(traineeid);
	}
	
	public Trainee edittrainee (int traineeid) {
		return traineeDao.getOne(traineeid);
	}
	
}
