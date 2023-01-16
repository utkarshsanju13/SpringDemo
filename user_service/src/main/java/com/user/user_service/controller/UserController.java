package com.user.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.entity.Contact;
import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${my.greeting}")
	private String greetingMssg;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		
		User user = this.userService.getUser(userId);
		
//		List<Contact> listOfContact = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
//		System.out.println(listOfContact);
//		user.setContacts(listOfContact);
		System.out.println(greetingMssg);
		
		return user;
	}
}
