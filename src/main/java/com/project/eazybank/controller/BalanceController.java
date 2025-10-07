package com.project.eazybank.controller;

import com.project.eazybank.model.AccountTransactions;
import com.project.eazybank.repo.AccountTransactionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BalanceController {
    private final AccountTransactionsRepository accountTransactionsRepository;

    @GetMapping("/myBalance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam long accountId) {

        return accountTransactionsRepository.
        findByCustomerIdOrderByTransactionDtDesc(accountId);
    }

}
