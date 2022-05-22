package com.luannp.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.luannp.workshopmongo.domain.User;
import com.luannp.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User jay = new User(null, "Jay Kyle", "jay@email.com");
		User johnny = new User(null, "Johnny B.", "johnny@email.com");
		User billy = new User(null, "Billy the Kid", "billy@email.com");
		
		userRepository.saveAll(Arrays.asList(jay, johnny, billy));
	}

}
