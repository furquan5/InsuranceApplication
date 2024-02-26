package com.ftj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ftj.entity.CitizenPlan;
@Repository
public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	
	@Query("SELECT DISTINCT(planName) FROM CitizenPlan")
	public List<String> getPlanName();
	
	
	@Query("SELECT DISTINCT(planStatus) FROM CitizenPlan")
	public List<String> getPlanStatus();

}
