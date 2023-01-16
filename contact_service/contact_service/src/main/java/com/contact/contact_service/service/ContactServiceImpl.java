package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			new Contact(23L, "amit@gmail.com", "Amit", 1L),
			new Contact(24L, "utk@gmail.com", "utk", 1L),
			new Contact(25L, "suman@gmail.com", "Suman", 12L),
			new Contact(26L, "mohit@gmail.com", "Mohit", 12L)
			);
			

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
