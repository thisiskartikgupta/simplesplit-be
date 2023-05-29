package com.simplesplit.core.service;

public class CommonUtils {

    public static boolean isValidPassword(String password) {
        return password != null && password.trim().length() > 1;
    }
}
