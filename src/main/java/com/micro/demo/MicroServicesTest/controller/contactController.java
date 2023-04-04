package com.micro.demo.MicroServicesTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.demo.MicroServicesTest.entity.Contact;
import com.micro.demo.MicroServicesTest.service.contactService;

@RestController
@RequestMapping("/contact")
public class contactController {

	 @Autowired
     private contactService conts;
    
    @GetMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return this.conts.getContactsOfUser(userId);
    }
}
