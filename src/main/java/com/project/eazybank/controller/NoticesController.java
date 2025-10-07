package com.project.eazybank.controller;

import com.project.eazybank.model.Notices;
import com.project.eazybank.repo.NoticesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
public class NoticesController {
    private final NoticesRepository noticesRepo;

    @GetMapping("/notices")
    public ResponseEntity<List<Notices>> getAllNotices(){
       List<Notices> notices = noticesRepo.findAllActiveNotices();
       if(notices != null){
           return ResponseEntity.ok()
                   .cacheControl(CacheControl.maxAge(100, TimeUnit.SECONDS))
                   .body(notices);
       }
       return null;
    }
}
