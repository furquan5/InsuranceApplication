package com.ftj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftj.entity.CitizenPlan;
import com.ftj.repo.CitizenPlanRepository;
import com.ftj.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private CitizenPlanRepository citizenPlanRepository;

	@Override
	public List<String> getPlanNames() {
		List<String> planName=citizenPlanRepository.getPlanName();
		return planName;
	}

	@Override
	public List<String> getPlanStatuses() {
		List<String> planStatus=citizenPlanRepository.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		
		return citizenPlanRepository.findAll();
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}



}
