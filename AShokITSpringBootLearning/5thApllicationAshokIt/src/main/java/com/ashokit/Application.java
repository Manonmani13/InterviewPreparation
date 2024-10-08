package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		 AccountService acser=context.getBean(AccountService.class);
		 acser.saveData();
		 acser.getData();
		 context.close();
	}
 
}
