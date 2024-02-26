package com.ftj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ftj.controller.ReportController;

@SpringBootApplication
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
		
		
		//This is the first application that I made using git 
		
		ReportController reportController=new ReportController;
	}

}
