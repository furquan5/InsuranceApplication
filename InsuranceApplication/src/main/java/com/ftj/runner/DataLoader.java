package com.ftj.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ftj.entity.CitizenPlan;
import com.ftj.repo.CitizenPlanRepository;


@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepository citizenPlanRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		citizenPlanRepository.deleteAll();
		
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Johhn");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.0);
		
		
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("David");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(5000.0);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationReason("Employeed");
		
		
		
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Mary");
		c4.setGender("Fe-Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(10000.0);
		
		
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("hashim");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Rental Income");
		
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Rohit");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmount(5000.0);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationReason("Employeed");
		
		
		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("Shaista");
		c7.setGender("Fe-Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmount(10000.0);
		
		
		
		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Karim");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Rental Income");
		
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Alam");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmount(5000.0);
		c9.setTerminationDate(LocalDate.now());
		c9.setTerminationReason("Employeed");
		
		
		
		
		CitizenPlan c10=new CitizenPlan();
		c10.setCitizenName("Sheerin");
		c10.setGender("Fe-Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmount(10000.0);
		
		
		
		CitizenPlan c11=new CitizenPlan();
		c11.setCitizenName("Arman");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Rental Income");
		
		
		CitizenPlan c12=new CitizenPlan();
		c12.setCitizenName("Afzal");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(5000.0);
		c12.setTerminationDate(LocalDate.now());
		c12.setTerminationReason("Employeed");
		
		
		
		
		List<CitizenPlan> list=Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		
		citizenPlanRepository.saveAll(list);
		
		
	}

}
