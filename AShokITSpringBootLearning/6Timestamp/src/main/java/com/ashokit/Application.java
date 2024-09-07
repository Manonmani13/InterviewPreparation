package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.InsuranceService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		 InsuranceService acser=context.getBean(InsuranceService.class);
		 acser.savePlan();
		 
		 context.close();
	}
 
}
