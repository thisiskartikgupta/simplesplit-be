package com.simplesplit.core.controller;

import com.simplesplit.core.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

//    @GetMapping("/transaction/get")
//    public ResponseEntity<?>
}
