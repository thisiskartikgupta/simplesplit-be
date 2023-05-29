package com.simplesplit.core.repository;

import com.simplesplit.core.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    boolean existsByUsername(String username);
    User findByUsername(String username);
}
