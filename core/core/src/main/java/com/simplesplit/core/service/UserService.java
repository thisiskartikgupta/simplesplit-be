package com.simplesplit.core.service;

import com.simplesplit.core.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public boolean isUserValid(Long id);

    public ResponseEntity<?> registerUser(User user);

    public ResponseEntity<?> loginUser(User user);
}
