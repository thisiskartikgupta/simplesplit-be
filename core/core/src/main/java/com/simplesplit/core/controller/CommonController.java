package com.simplesplit.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }
}
