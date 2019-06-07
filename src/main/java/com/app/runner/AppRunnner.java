package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.app.service.INotificationService;
@Configuration
public class AppRunnner implements CommandLineRunner {
		@Autowired
		private INotificationService service;
	
	public void run(String... args) throws Exception {
		service.notificate();
		
	}

}
