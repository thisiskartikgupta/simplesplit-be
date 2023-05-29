package com.simplesplit.core.service;

import com.simplesplit.core.model.User;
import com.simplesplit.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isUserValid(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public ResponseEntity<?> registerUser(User user) {
        if(Objects.equals(user.getUsername(), "") || !CommonUtils.isValidPassword(user.getPassword())) {
            return new ResponseEntity<>("ERR010: Bad Credentials", HttpStatus.FORBIDDEN);
        }

        if(userRepository.existsByUsername(user.getUsername())) {
            return new ResponseEntity<>("ERR020: User already exists", HttpStatus.CONFLICT);
        }

        userRepository.save(user);
        return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> loginUser(User user) {
        String userName = user.getUsername(), password = user.getPassword();

        if(!userRepository.existsByUsername(user.getUsername()))
            return new ResponseEntity<>("ERR020: User already exists", HttpStatus.CONFLICT);

        User fetchedUser = userRepository.findByUsername(userName);
        if(fetchedUser.getPassword().equals(password))
            return new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return new ResponseEntity<>("ERR011: Bad Credentials", HttpStatus.UNAUTHORIZED);
    }

}
