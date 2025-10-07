package com.project.eazybank.controller;

import com.project.eazybank.model.Accounts;
import com.project.eazybank.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam long accountId) {
        return accountRepository.findByCustomerId(accountId);
    }
}
