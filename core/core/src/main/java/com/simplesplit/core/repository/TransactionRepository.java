package com.simplesplit.core.repository;

import com.simplesplit.core.model.Transaction;
import com.simplesplit.core.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
