package com.simplesplit.core.service;

import com.simplesplit.core.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements  TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public ResponseEntity<?> createTransaction(String owner, String tenant, Double balance) {
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> createTransaction(String owner, String[] tenant, Double balance) {
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
}
