package com.project.eazybank.controller;

import com.project.eazybank.model.Loans;
import com.project.eazybank.repo.LoansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {
    private final LoansRepository loansRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoans(@RequestParam long customerId){
        return loansRepository.findByCustomerIdOrderByCreateDtDesc(customerId);
    }
}
