package com.project.eazybank.controller;

import com.project.eazybank.model.Cards;
import com.project.eazybank.repo.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardsController {
    private final CardsRepository cardsRepository;

    public List<Cards> accountDetails(@RequestParam long customerId) {
        return cardsRepository.findByCustomerId(customerId);
    }
}
