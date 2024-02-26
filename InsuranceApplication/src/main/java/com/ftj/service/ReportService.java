package com.ftj.service;

import java.util.List;

import com.ftj.entity.CitizenPlan;
import com.ftj.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExcel();
	
	public boolean exportPdf();
	
}
