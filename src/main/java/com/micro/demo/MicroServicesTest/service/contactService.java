package com.micro.demo.MicroServicesTest.service;

import java.util.List;

import com.micro.demo.MicroServicesTest.entity.Contact;

public interface contactService {

	public List<Contact> getContactsOfUser(Long userId);
}
