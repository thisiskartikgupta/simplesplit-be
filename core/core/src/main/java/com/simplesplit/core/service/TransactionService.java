package com.simplesplit.core.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    public ResponseEntity<?> createTransaction(String owner, String tenant, Double balance);

    public ResponseEntity<?> createTransaction(String owner, String[] tenant, Double balance);
}
