package com.example.demo.serices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.beans.User;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	UserDaoService userDaoService;
	
	private static final Logger log=LoggerFactory.getLogger(UserDaoCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","Admin");
		long userId= userDaoService.insert(user);
		log.info("New User is created"+ user);
		System.out.println(userId);
	}

}
