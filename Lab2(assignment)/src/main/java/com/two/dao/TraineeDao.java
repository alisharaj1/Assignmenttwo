package com.two.dao;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.two.entity.Trainee;

@Transactional
@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer> {


}
