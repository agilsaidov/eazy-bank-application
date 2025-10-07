package com.project.eazybank.controller;

import com.project.eazybank.model.Contacts;
import com.project.eazybank.repo.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.Date;

@RestController
@RequiredArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;

    @PostMapping("/contact")
    public Contacts saveContactInquiryDetails(@RequestBody Contacts contacts) {
        contacts.setContactId(getServiceReqNumber());
        contacts.setCreatedDt(new Date(System.currentTimeMillis()));
        return contactRepository.save(contacts);
    }

    private String getServiceReqNumber() {
        SecureRandom random = new SecureRandom();
        int randomInt = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + randomInt;
    }
}
