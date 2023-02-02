package com.example.addressbooksystem.controller;

import com.example.addressbooksystem.entity.Contact;
import com.example.addressbooksystem.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact){
        return contactService.createContact(contact);
    }
}
