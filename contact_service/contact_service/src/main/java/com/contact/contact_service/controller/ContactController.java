package com.contact.contact_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") Long userId){
		
		return contactService.getContactsOfUser(userId);
	}
}
