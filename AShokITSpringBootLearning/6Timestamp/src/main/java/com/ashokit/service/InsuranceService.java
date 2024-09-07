package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.InsurancePlan;
import com.ashokit.repository.InsuranceRepository;

@Service
public class InsuranceService {
	@Autowired
	InsuranceRepository insuRepo;
	
	public void savePlan() {
		InsurancePlan plan=new InsurancePlan();
		plan.setPlanName("SNAPP");
		plan.setPlanStatus("Approved");
		insuRepo.save(plan);
		
	}

}
