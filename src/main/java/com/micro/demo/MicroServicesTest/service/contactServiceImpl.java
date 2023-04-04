package com.micro.demo.MicroServicesTest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.micro.demo.MicroServicesTest.entity.Contact;

@Service
public class contactServiceImpl implements contactService{

	 List<Contact> list= List.of(
	            new Contact(2l,"ani@gmail.com","ani",1l),
	            new Contact(3l,"nikki@gmail.com","nikki",2l),
	            new Contact(4l,"deep@gmail.com","deep",3l),
	            new Contact(5l,"dolly@gmail.com","dolly",4l),
	            new Contact(6l,"akash@gmail.com","akash",5l)
	            );
	    
	    
	    
	    
	    @Override
	    public List<Contact> getContactsOfUser(Long userId) {
	      
	        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	    }

}
