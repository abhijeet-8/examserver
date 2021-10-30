package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		System.out.println();
		System.out.println("this is abhijeet kumar");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is starting code");
//		User user = new User();
//		user.setFirstname("abhijeet");
//		user.setLastname("kumar");
//		user.setEmail("abc@gmail.com");
//		user.setPassword("abhijeet");
//		user.setProfile("anything.ping");
//		user.setUsername("abhijeet24");
//
//		Role role1 = new Role();
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<UserRole>();
//
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//
//		System.out.println(user1.getUsername());

	}

}
